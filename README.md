# Superheroes


# Instruction


- Go to project directory

- Build docker image by running;
'docker build -t superheroes-server:latest .'

- Run image by running;
'docker run -p8081:8080 superheroes-server:latest'


# Endpoints

- GET  http://localhost:8081/superHero/{name}

- POST http://localhost:8081/superhero


   {
             "name" : "ironman",
             "alias" : "tonystark",
             "origin" : "afghanistan",
             "powers" : [],
             "weapons" : ["abc","de"],
             "associations" : ["marvel"]
             
  }

