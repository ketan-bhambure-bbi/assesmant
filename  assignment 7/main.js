let flatjson = [
    { type: 'div', children: [
      { type: 'h1', children: [{ type: 'p' }] },
      { type: 'ul', children: [
        { type: 'li' },
        { type: 'li' }
      ]}
    ]}
  ]
for(var i=0;i<flatjson.length;i++){
    var div = document.createElement(flatjson[0].type);
    div.setAttribute('class', 'note');
    document.body.appendChild(div);
    for(var j=0;j<flatjson[i].children.length;j++){
        var h1=document.createElement(flatjson[i].children[j].type);
        h1.setAttribute('class', 'note1')
        div.appendChild(h1);
        for(var k=0;k<flatjson[i].children[j].children.length;k++){
            var l=document.createElement(flatjson[i].children[j].children[k].type);
            l.setAttribute('class','note2');
            h1.appendChild(l);             
        }
    }
}