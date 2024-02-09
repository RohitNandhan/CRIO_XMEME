// MongoDB Playground
// Use Ctrl+Space inside a snippet or a string literal to trigger completions.

// The current database to use.
use('collections');

// Create many document in the collection.
db.getCollection('Doc1').insertMany([
  {
      "name": "jill",
      "url": "xyz.com",
      "caption": "xyz company"
  },
  {
      "name": "jangu",
      "url": "xxx.com",
      "caption": "site blocked in India"
  },
  {
      "name": "jaku",
      "url": "zzz.com",
      "caption": "time to bed...?"
  }
]);
