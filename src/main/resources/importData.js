
var jsonData =[
    {
      "extId": "001",
      "message": "Hello world"
    },
    {
      "extId": "002",
      "message": "This is second message"
    }
  ];

var dbName = "greetings";
var collectionName = "greetings";

// Connect to the database
var db = db.getSiblingDB(dbName);

// Insert data into the collection
db[collectionName].insertMany(jsonData);

print("Data imported successfully!");