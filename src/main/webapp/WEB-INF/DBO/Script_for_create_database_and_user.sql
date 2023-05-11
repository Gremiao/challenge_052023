USE master;
CREATE DATABASE challenge;
CREATE LOGIN user_challenge WITH PASSWORD = 'user_password', CHECK_POLICY = OFF, CHECK_EXPIRATION = OFF;
GO
USE challenge;
CREATE USER user_challenge FOR LOGIN user_challenge;
GO
ALTER LOGIN user_challenge WITH DEFAULT_DATABASE = challenge;
GO
ALTER SERVER ROLE sysadmin ADD MEMBER user_challenge;
GO
ALTER ROLE db_owner ADD MEMBER user_challenge;
GO