# Report

## Questions
### Where is the database? Explain the used database and how/when it runs
H2 is the database used in this project which can be defined in the persistence.xml file. The driver used for the H2 databases is JDBC.

### SQL used to create the Customer entity

```
CREATE TABLE Customer (
  id BIGINT NOT NULL PRIMARY KEY,
  name VARCHAR(255) NOT NULL
)
```
This can also be checked by turning value="true" for:

```
<property name="hibernate.show_sql" value="false"/>
```
which will then show the sql code when its run.

### An explanation of how you inspected the database tables and what tables were created

I was not able to figure this question out and was therefore not able to inspect the database. The only thing i did figure out was then turning value="true" in the persistence.xml line i showed in the privous question, i could review the sql code and statements (create, drop, join etc) in the terminal.

### Technical problems encountered during installation and use of JPA

I had some problems during testing whith some JPA configuration, but I just created a new fork of the given github repository and copy-pasted all my changes
whithin the different classes and it got solved.

### Any pending issues with this assignment that you did not manage to solve

The only issue i did not manage to solve, is the database inspection part which i did not quite understand how to complete. Everything else should be fine.
