As per Eric Evans' book Domain-Driven Design, the “repository is a mechanism for encapsulating storage, retrieval, and
search behavior, which emulates a collection of objects.”

Likewise, according to Patterns of Enterprise Application Architecture, it “mediates between the domain and data mapping
layers using a collection-like interface for accessing domain objects.”

In other words, a repository also deals with data and hides queries similar to DAO. However, it sits at a higher level,
closer to the business logic of an app.

Consequently, a repository can use a DAO to fetch data from the database and populate a domain object. Or, it can
prepare the data from a domain object and send it to a storage system using a DAO for persistence.

Let's examine a simple implementation of the Repository pattern for the User domain.

A repository relies on DAOs for accessing data from various sources.

Here, we've used the UserDaoImpl to send/retrieve data from the database.
So far, we can say that the implementations of DAO and repository look very similar because the User class is an anemic
domain. And, a repository is just another layer over the data-access layer (DAO).
However, DAO seems a perfect candidate to access the data, and a repository is an ideal way to implement a business use-case.