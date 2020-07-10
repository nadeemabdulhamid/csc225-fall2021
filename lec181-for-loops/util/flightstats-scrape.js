
// https://www.flightstats.com/v2/flight-tracker/arrivals/ATL


function defineJavaObject(className, txt) {
    pcs = txt.split("\n");
    let [flightNo, deptTime, arrTime, originCode, operator, originCity ] = pcs;
    line = `new ${className}("${flightNo}", "${operator}", "${originCode}", "${originCity}", "${deptTime}", "${arrTime}")`;
    return line;
}

function scrapeStats() {
    let results = $$(".flrJsE > div").slice(1);
    let codeText = "Arrival[] data = { ";
    for (r in results) { 
        //console.log(results[r].innerText + "\n"); 

        codeText = codeText + "    " + defineJavaObject("Arrival", results[r].innerText) + ",\n";
    }
    codeText = codeText.slice(0, -2) + " };"   // take off the trailing ",\n" on codeText
    console.log(codeText);
}

scrapeStats();



`KE 3782
06:15
07:08
AVL
Korean Air / Operated by Endeavor Air on behalf of Delta Air Lines 4628
Asheville`