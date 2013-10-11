package de.i3mainz.flexgeo.portal.liferay.services.service.base;

import de.i3mainz.flexgeo.portal.liferay.services.service.OGCServiceLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OGCServiceLocalServiceClpInvoker {
    private String _methodName0;
    private String[] _methodParameterTypes0;
    private String _methodName1;
    private String[] _methodParameterTypes1;
    private String _methodName2;
    private String[] _methodParameterTypes2;
    private String _methodName3;
    private String[] _methodParameterTypes3;
    private String _methodName4;
    private String[] _methodParameterTypes4;
    private String _methodName5;
    private String[] _methodParameterTypes5;
    private String _methodName6;
    private String[] _methodParameterTypes6;
    private String _methodName7;
    private String[] _methodParameterTypes7;
    private String _methodName8;
    private String[] _methodParameterTypes8;
    private String _methodName9;
    private String[] _methodParameterTypes9;
    private String _methodName10;
    private String[] _methodParameterTypes10;
    private String _methodName11;
    private String[] _methodParameterTypes11;
    private String _methodName12;
    private String[] _methodParameterTypes12;
    private String _methodName14;
    private String[] _methodParameterTypes14;
    private String _methodName15;
    private String[] _methodParameterTypes15;
    private String _methodName16;
    private String[] _methodParameterTypes16;
    private String _methodName17;
    private String[] _methodParameterTypes17;
    private String _methodName18;
    private String[] _methodParameterTypes18;
    private String _methodName19;
    private String[] _methodParameterTypes19;
    private String _methodName68;
    private String[] _methodParameterTypes68;
    private String _methodName69;
    private String[] _methodParameterTypes69;
    private String _methodName74;
    private String[] _methodParameterTypes74;
    private String _methodName75;
    private String[] _methodParameterTypes75;
    private String _methodName76;
    private String[] _methodParameterTypes76;
    private String _methodName77;
    private String[] _methodParameterTypes77;
    private String _methodName78;
    private String[] _methodParameterTypes78;

    public OGCServiceLocalServiceClpInvoker() {
        _methodName0 = "addOGCService";

        _methodParameterTypes0 = new String[] {
                "de.i3mainz.flexgeo.portal.liferay.services.model.OGCService"
            };

        _methodName1 = "createOGCService";

        _methodParameterTypes1 = new String[] { "long" };

        _methodName2 = "deleteOGCService";

        _methodParameterTypes2 = new String[] { "long" };

        _methodName3 = "deleteOGCService";

        _methodParameterTypes3 = new String[] {
                "de.i3mainz.flexgeo.portal.liferay.services.model.OGCService"
            };

        _methodName4 = "dynamicQuery";

        _methodParameterTypes4 = new String[] {  };

        _methodName5 = "dynamicQuery";

        _methodParameterTypes5 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName6 = "dynamicQuery";

        _methodParameterTypes6 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
            };

        _methodName7 = "dynamicQuery";

        _methodParameterTypes7 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName8 = "dynamicQueryCount";

        _methodParameterTypes8 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName9 = "dynamicQueryCount";

        _methodParameterTypes9 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery",
                "com.liferay.portal.kernel.dao.orm.Projection"
            };

        _methodName10 = "fetchOGCService";

        _methodParameterTypes10 = new String[] { "long" };

        _methodName11 = "fetchOGCServiceByUuidAndCompanyId";

        _methodParameterTypes11 = new String[] { "java.lang.String", "long" };

        _methodName12 = "fetchOGCServiceByUuidAndGroupId";

        _methodParameterTypes12 = new String[] { "java.lang.String", "long" };

        _methodName14 = "getPersistedModel";

        _methodParameterTypes14 = new String[] { "java.io.Serializable" };

        _methodName15 = "getOGCServiceByUuidAndCompanyId";

        _methodParameterTypes15 = new String[] { "java.lang.String", "long" };

        _methodName16 = "getOGCServiceByUuidAndGroupId";

        _methodParameterTypes16 = new String[] { "java.lang.String", "long" };

        _methodName17 = "getOGCServices";

        _methodParameterTypes17 = new String[] { "int", "int" };

        _methodName18 = "getOGCServicesCount";

        _methodParameterTypes18 = new String[] {  };

        _methodName19 = "updateOGCService";

        _methodParameterTypes19 = new String[] {
                "de.i3mainz.flexgeo.portal.liferay.services.model.OGCService"
            };

        _methodName68 = "getBeanIdentifier";

        _methodParameterTypes68 = new String[] {  };

        _methodName69 = "setBeanIdentifier";

        _methodParameterTypes69 = new String[] { "java.lang.String" };

        _methodName74 = "addOGCService";

        _methodParameterTypes74 = new String[] {
                "long", "java.lang.String", "java.lang.String", "java.net.URL",
                "java.lang.String", "java.lang.String",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName75 = "addEntryResources";

        _methodParameterTypes75 = new String[] {
                "de.i3mainz.flexgeo.portal.liferay.services.model.OGCService",
                "boolean", "boolean"
            };

        _methodName76 = "addEntryResources";

        _methodParameterTypes76 = new String[] {
                "de.i3mainz.flexgeo.portal.liferay.services.model.OGCService",
                "java.lang.String[][]", "java.lang.String[][]"
            };

        _methodName77 = "addEntryResources";

        _methodParameterTypes77 = new String[] { "long", "boolean", "boolean" };

        _methodName78 = "addEntryResources";

        _methodParameterTypes78 = new String[] {
                "long", "java.lang.String[][]", "java.lang.String[][]"
            };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return OGCServiceLocalServiceUtil.addOGCService((de.i3mainz.flexgeo.portal.liferay.services.model.OGCService) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return OGCServiceLocalServiceUtil.createOGCService(((Long) arguments[0]).longValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return OGCServiceLocalServiceUtil.deleteOGCService(((Long) arguments[0]).longValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return OGCServiceLocalServiceUtil.deleteOGCService((de.i3mainz.flexgeo.portal.liferay.services.model.OGCService) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return OGCServiceLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return OGCServiceLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return OGCServiceLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return OGCServiceLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return OGCServiceLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return OGCServiceLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return OGCServiceLocalServiceUtil.fetchOGCService(((Long) arguments[0]).longValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return OGCServiceLocalServiceUtil.fetchOGCServiceByUuidAndCompanyId((java.lang.String) arguments[0],
                ((Long) arguments[1]).longValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return OGCServiceLocalServiceUtil.fetchOGCServiceByUuidAndGroupId((java.lang.String) arguments[0],
                ((Long) arguments[1]).longValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return OGCServiceLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return OGCServiceLocalServiceUtil.getOGCServiceByUuidAndCompanyId((java.lang.String) arguments[0],
                ((Long) arguments[1]).longValue());
        }

        if (_methodName16.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes16, parameterTypes)) {
            return OGCServiceLocalServiceUtil.getOGCServiceByUuidAndGroupId((java.lang.String) arguments[0],
                ((Long) arguments[1]).longValue());
        }

        if (_methodName17.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes17, parameterTypes)) {
            return OGCServiceLocalServiceUtil.getOGCServices(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName18.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes18, parameterTypes)) {
            return OGCServiceLocalServiceUtil.getOGCServicesCount();
        }

        if (_methodName19.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes19, parameterTypes)) {
            return OGCServiceLocalServiceUtil.updateOGCService((de.i3mainz.flexgeo.portal.liferay.services.model.OGCService) arguments[0]);
        }

        if (_methodName68.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes68, parameterTypes)) {
            return OGCServiceLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName69.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes69, parameterTypes)) {
            OGCServiceLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName74.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes74, parameterTypes)) {
            return OGCServiceLocalServiceUtil.addOGCService(((Long) arguments[0]).longValue(),
                (java.lang.String) arguments[1],
                (java.lang.String) arguments[2], (java.net.URL) arguments[3],
                (java.lang.String) arguments[4],
                (java.lang.String) arguments[5],
                (com.liferay.portal.service.ServiceContext) arguments[6]);
        }

        if (_methodName75.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes75, parameterTypes)) {
            OGCServiceLocalServiceUtil.addEntryResources((de.i3mainz.flexgeo.portal.liferay.services.model.OGCService) arguments[0],
                ((Boolean) arguments[1]).booleanValue(),
                ((Boolean) arguments[2]).booleanValue());

            return null;
        }

        if (_methodName76.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes76, parameterTypes)) {
            OGCServiceLocalServiceUtil.addEntryResources((de.i3mainz.flexgeo.portal.liferay.services.model.OGCService) arguments[0],
                (java.lang.String[]) arguments[1],
                (java.lang.String[]) arguments[2]);

            return null;
        }

        if (_methodName77.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes77, parameterTypes)) {
            OGCServiceLocalServiceUtil.addEntryResources(((Long) arguments[0]).longValue(),
                ((Boolean) arguments[1]).booleanValue(),
                ((Boolean) arguments[2]).booleanValue());

            return null;
        }

        if (_methodName78.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes78, parameterTypes)) {
            OGCServiceLocalServiceUtil.addEntryResources(((Long) arguments[0]).longValue(),
                (java.lang.String[]) arguments[1],
                (java.lang.String[]) arguments[2]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
