create table olmaps_OGCService (
	uuid_ VARCHAR(75) null,
	serviceId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	serviceName VARCHAR(75) null,
	serviceURL VARCHAR(75) null,
	serviceType VARCHAR(75) null
);

create table olmaps_OGCServiceLayer (
	uuid_ VARCHAR(75) null,
	layerId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	layerName VARCHAR(75) null,
	layerServiceId LONG,
	layerOptions VARCHAR(75) null,
	layerDisplayOptions VARCHAR(75) null
);