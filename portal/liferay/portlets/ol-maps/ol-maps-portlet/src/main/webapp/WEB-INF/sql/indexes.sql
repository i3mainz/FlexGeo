create index IX_B3B7AE8F on olmaps_OGCService (groupId);
create index IX_F99871D0 on olmaps_OGCService (groupId, serviceType);
create index IX_82B598D9 on olmaps_OGCService (uuid_);
create index IX_76A99AF on olmaps_OGCService (uuid_, companyId);
create unique index IX_8DBBFF1 on olmaps_OGCService (uuid_, groupId);

create index IX_52D52DC8 on olmaps_OGCServiceLayer (groupId);
create index IX_C85B5164 on olmaps_OGCServiceLayer (groupId, layerName);
create index IX_776B9252 on olmaps_OGCServiceLayer (uuid_);
create index IX_EC662A96 on olmaps_OGCServiceLayer (uuid_, companyId);
create unique index IX_75845E98 on olmaps_OGCServiceLayer (uuid_, groupId);