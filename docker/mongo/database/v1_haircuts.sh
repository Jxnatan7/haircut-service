mongosh -u root -p root --authenticationDatabase admin localhost/haircut-service --eval 'db.createUser({ user: "root", pwd: "root", roles: [ { role: "root", db: "admin" }, { role: "dbOwner", db: "haircut-service" }, { role: "readWrite", db: "haircut-service" }, { role: "dbAdmin", db: "haircut-service" } ] });'