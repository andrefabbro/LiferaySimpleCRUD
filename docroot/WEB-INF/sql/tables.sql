create table mobilephone_MobilePhone (
	id_ LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	brand VARCHAR(75) null,
	description VARCHAR(75) null,
	releaseDate DATE null,
	price DOUBLE
);