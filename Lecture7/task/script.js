const url = "https://data.stortinget.no/eksport/dagensrepresentanter?format=JSON";

async function run() {
    const res = await fetch(url);
    const data = await res.json();

    const reps = data.dagensrepresentanter_oversikt.dagensrepresentanter_liste;

    const result = reps
        .map(r => ({
            firstname: r.fornavn,
            lastname: r.etternavn,
            party: r.parti?.navn,
            birthdate: new Date(r.foedselsdato),
        }))
        .sort((a, b) => a.birthdate - b.birthdate);

    result.forEach(r => {
        console.log(
            `${r.firstname} ${r.lastname}, ${r.party}, ${r.birthdate.toISOString().split("T")[0]}`
        );
    });
}

run().catch(console.error);
