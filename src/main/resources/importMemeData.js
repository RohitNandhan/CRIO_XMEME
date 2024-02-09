
var dbName = "meme"; // Change the database name
var collectionName = "meme"; // Change the collection name

// Connect to the database
var db = db.getSiblingDB(dbName);

// Load JSON data from file
var fileData = cat('sample-data-meme.json');
var jsonDataFromFile = JSON.parse(fileData);

// Insert data into the collection
db[collectionName].insertMany(jsonDataFromFile);
print("Data imported!");
