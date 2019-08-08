var exec = require('cordova/exec');

// exports.coolMethod = function (arg0, success, error) {
//     exec(success, error, 'CallWebView', 'coolMethod', [arg0]);
// };

// new function


module.exports.add = function (arg0,success,error)
{
    exec(success,error,'CallWebView','add',[arg0]);
}

module.exports.sub = function (arg0,success,error)
{
    exec(success,error,'CallWebView','sub',[arg0]);
}