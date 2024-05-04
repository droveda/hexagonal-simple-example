# Wiremock
download and instalation
https://wiremock.org/docs/download-and-installation/

download the jar at the end of the page above

### Executar o wiremock
java -jar wiremock-standalone-3.5.4.jar --port 8082
it will create a directory called "mappings" inside this folder you can put the jsons files that will be your mock api request/response

files for the address API (address.json, address_2.json)

simple request to the mock API: curl --location 'http://localhost:8082/addresses/38400000'


to execute kafka and mongoDB local, use the docker-compose.yaml file


## Acessar o container do mongpo db
docker exec -it <id do container> /bin/bash
mongosh -u root -p


## Acessar o kafka utilizando o offset explorer ou o plugin do intellij chamado Kafkalytic
criar os tópicos: tp-cpf-validated, tp-cpf-validation


### Alguns requests da API
curl --location 'http://localhost:8081/api/v1/customers' \
--header 'Content-Type: application/json' \
--data '{
    "name": "Fulano",
    "cpf": "11111111111",
    "zipCode": "38400000"
}'

curl --location 'http://localhost:8081/api/v1/customers/663683c26f90a05b9b1dcee3'

curl --location --request DELETE 'http://localhost:8081/api/v1/customers/66367e1ed4c1e363ec474a62'

curl --location --request PUT 'http://localhost:8081/api/v1/customers/66367e1ed4c1e363ec474a62' \
--header 'Content-Type: application/json' \
--data '{
    "name": "Fulano",
    "cpf": "11111111111",
    "zipCode": "38400000"
}'