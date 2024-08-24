This Restful API Project is created using Springboot and PSQL.
Follow these steps to run application => Go to src=>main=>service=>AssignmentApplication.java(run this file)
Entity folder:Notably Table name is suppliers which contains 6 fields i:e supplier_id,company_name,website,location,nature_of_business(enum type),manufacturing_process(enum) 
Repo folder:The repository folder contains interfaces that extend Spring Data JPA repositories. These interfaces handle data access and interactions with the database.
Controller folder: The controller folder contains classes that handle HTTP requests and responses. API endpoint for POST req is /api/supplier.
