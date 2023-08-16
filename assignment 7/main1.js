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
function traverse(flatjson, root) {

    flatjson.forEach(element => {

        var ele = document.createElement(element.type);
        if (element.text) {
            ele.textContent = element.text;
        }

        if (!root) {
            document.body.appendChild(ele);
        } 

        else {
            root.appendChild(ele);
        }

        if (element.children) {
            traverse(element.children, ele);
        }

    });

}
traverse(flatjson)
;
