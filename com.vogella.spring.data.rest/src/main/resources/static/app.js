document.write("Hello first JavaScript sample!");

const client = require('./restclient'); 
client({path: '/api/tasks/1'}).then(response => { 
    console.log('response: ', response);
    document.write("response: " + response + " summary: " + response.summary);
}, error => { 
    document.write("error: " + error);
});
