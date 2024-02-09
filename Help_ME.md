


HTTP CALLS:
        (sample call/testing)
            curl localhost:8090/say-hello?messageId=001 
    GET - 
    
    curl localhost:8090/meme

    Invoke-RestMethod -Uri "http://localhost:8090/say-hello?messageId=001"

    POST - (sample)

    curl -X POST -H "Content-Type: application/json" -d '{"name": "exampleName", "url": "example.com", "caption": "Example Caption"}' http://localhost:8090/meme

    


MongoDB  
    Connection String :
        mongodb://localhost:27017

    Commmands:  
        show dbs
        use collections
        show collections

    Load JS file:
        load("file directory address");



CheckStyle Rewrite:

    gradlew rewriteRun
    ./gradlew rewriteApply
   
    https://docs.openrewrite.org/running-recipes/popular-recipe-guides/automatically-fix-checkstyle-violations

        