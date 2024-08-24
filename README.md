# Makersharks Assignment 
This Restful API Project is created using Springboot and PSQL.

### Follow these steps to run application =>
1. Go to `src=>main=>service=>AssignmentApplication.java(run this file)`

### Search Request
```
curl --location 'http://localhost:8080/api/supplier/query' \
--header 'Content-Type: application/json' \
--data '{
    "company_name": "abc",
    "website": "xyz.com",
    "location": "pip",
    "nature_of_business": "BUSINESS_NATURE_SMALL_SCALE",
    "manufacturing_processes": "MANUFACTuRING_PROCESS_TYPE_MOULDING"
}'
```
### Post Request
```
curl --location 'http://localhost:8080/api/supplier' \
--header 'Content-Type: application/json' \
--data '{
    "company_name": "xylo",
    "website": "xyzo.com",
    "location": "london",
    "nature_of_business": "BUSINESS_NATURE_MEDIUM_SCALE",
    "manufacturing_processes": "MANUFACTuRING_PROCESS_TYPE_CASTING"
}'
```
# Entity folder
Notably Table name is suppliers which contains 6 fields i:e supplier_id,company_name,website,location,nature_of_business(enum type),manufacturing_process(enum) 
# Repo folder 
The repository folder contains interfaces that extend Spring Data JPA repositories. These interfaces handle data access and interactions with the database.
# Controller folder 
The controller folder contains classes that handle HTTP requests and responses. API endpoint for POST req is /api/supplier and for search is /api/supplier/query
### TODO
For security and sensitive data purpose,used JWT bearer tokens.
