# Play with MongoDB example

An example project for using MongoDB with play-framework (morphia is used in this project for MongoDB object ocument mapping)

## Prerequisite

1. Install play framework
2. Install MongoDB

## Development

1. Run mongo daemon (keep it running in a different terminal)
- `mongod`

2. Bootstrap DB (movies.json exists in the root directory of this project)
- `mongoimport --db MoviesDemo --collection Movie --file movies.json --jsonArray`

3. Run play server
For Linux operating systems
- `sh run.sh`

For windows
- Run the `run.bat` file

##Test APIs
1. http://localhost:9000/api/movies
2. http://localhost:9000/api/movies/Braveheart


