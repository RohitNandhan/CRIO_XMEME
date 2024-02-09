
var jsonData =
[
  {
    "name": "jill",
    "url": "xyz.com",
    "cation": "xyz company"
  },
  {
    "name": "jangu",
    "url": "xxx.com",
    "cation": "site blocked in india"
  },
  {
    "name": "jaku",
    "url": "zzz.com",
    "cation": "time to bed...?"
  }
  
]

var dbName = "meme";
var collectionName = "meme";

// Connect to the database
var db = db.getSiblingDB(dbName);

// Insert data into the collection
db[collectionName].insertMany(jsonData);

print("Data imported successfully!");