// MongoDB Playground
// Use Ctrl+Space inside a snippet or a string literal to trigger completions.

// The current database to use.
use('collections');

// Create a new document in the collection.
db.getCollection('Doc1').insertMany([
    {
        "name": "jill",
        "url": "xyz.com",
        "cation": "xyz company"
    },
    {
        "name": "jangu",
        "url": "xxx.com",
        "cation": "site blocked in India"
    },
    {
        "name": "jaku",
        "url": "zzz.com",
        "cation": "time to bed...?"
    }
]);
