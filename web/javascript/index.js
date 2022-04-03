/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
(function() {
    function sortirajProizvode(event) {
        const sortiraniProizvodi = proizvodi;
        switch(event.target.value) {
            case "0":
                sortiraniProizvodi.sort((a, b) => {
                    return a.id - b.id;
                });
                break;
            case "1":
                sortiraniProizvodi.sort((a, b) => {
                    if (a.naziv > b.naziv) return 1;
                    if (b.naziv > a.naziv) return -1;
                    return 0;
                });
                
                break;
            case "2":
                sortiraniProizvodi.sort((a, b) => {
                    if (a.naziv > b.naziv) return -1;
                    if (b.naziv > a.naziv) return 1;
                    return 0;
                });
                break;
            case "3":
                sortiraniProizvodi.sort((a, b) => {
                    return a.cena - b.cena;
                });
                break;
            case "4":
                sortiraniProizvodi.sort((a, b) => {
                    return b.cena - a.cena;
                });
                break;
            default: break;
        }
        
        document.getElementById("proizvodiTableBody").innerHTML = sortiraniProizvodi.map((p) => `
            <tr scope="row">
                <td>${p.naziv}</td>
                <td>${p.cena}</td>
                <td>${p.opis}</td>
                <td>${p.kategorija.naziv}</td>
                <td>
                    <a href="EditProizvod?id=${p.id}">Izmeni</a>
                </td>
                <td>
                    <a href="DeleteProizvod?id=${p.id}">Obrisi</a>
                </td>
            </tr>
        `).join('');
    }
    
    const proizvodiSelect = document.getElementById("proizvodiSortSelect");
    proizvodiSelect.onchange = sortirajProizvode;
    
    function pretraziProizvode(event){
        const listaProizvoda = proizvodi.filter((p) => {
            return (
                    p.naziv.toLowerCase().includes(event.target.value.toLowerCase()) ||
                    p.opis.toLowerCase().includes(event.target.value.toLowerCase())
            );        
        });
        
        document.getElementById("proizvodiTableBody").innerHTML = listaProizvoda.map((p) => `
            <tr scope="row">
                <td>${p.naziv}</td>
                <td>${p.cena}</td>
                <td>${p.opis}</td>
                <td>${p.kategorija.naziv}</td>
                <td>
                    <a href="EditProizvod?id=${p.id}">Izmeni</a>
                </td>
                <td>
                    <a href="DeleteProizvod?id=${p.id}">Obrisi</a>
                </td>
            </tr>
        `).join('');
    }
    
    const proizvodiPretraga = document.getElementById("pretraziProizvode");
    proizvodiPretraga.onkeyup = pretraziProizvode;
})();




