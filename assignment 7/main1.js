main1
let flatjson = [
    {
        type: 'div', children: [
            { type: 'h1', children: [{ type: 'p', text: 'abtc' }] },
            {
                type: 'ul', children: [
                    { type: 'li', text: 'item 1' },
                    { type: 'li', text: 'item 2' }
                ]
            }
        ]
    }
]
for (var i = 0; i < flatjson.length; i++) {
    var div = document.createElement(flatjson[0].type);
    div.setAttribute('class', 'note');
    document.body.appendChild(div);
    for (var j = 0; j < flatjson[i].children.length; j++) {
        var h1 = document.createElement(flatjson[i].children[j].type);
        h1.textContent = flatjson[i].children[j].text;
        h1.setAttribute('class', 'note1')
        div.appendChild(h1);
        for (var k = 0; k < flatjson[i].children[j].children.length; k++) {
            var l = document.createElement(flatjson[i].children[j].children[k].type);
            l.setAttribute('class', 'note2');
            l.textContent = flatjson[i].children[j].children[k].text;
            h1.appendChild(l);
        }
    }
}
