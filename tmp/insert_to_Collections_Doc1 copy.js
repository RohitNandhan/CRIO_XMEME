// MongoDB Playground
// Use Ctrl+Space inside a snippet or a string literal to trigger completions.

// The current database to use.
use('collections');

// Create a new document in the collection.
db.getCollection('Doc1').insertOne({
  "name": "jill",
  "url": "xyz.com",
  "caption": "xyz company"
});
