package de.i3mainz.flexgeo.portal.liferay.services.service.base;

import de.i3mainz.flexgeo.portal.liferay.services.service.OGCServiceServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OGCServiceServiceClpInvoker {
    private String _methodName48;
    private String[] _methodParameterTypes48;
    private String _methodName49;
    private String[] _methodParameterTypes49;

    public OGCServiceServiceClpInvoker() {
        _methodName48 = "getBeanIdentifier";

        _methodParameterTypes48 = new String[] {  };

        _methodName49 = "setBeanIdentifier";

        _methodParameterTypes49 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName48.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes48, parameterTypes)) {
            return OGCServiceServiceUtil.getBeanIdentifier();
        }

        if (_methodName49.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes49, parameterTypes)) {
            OGCServiceServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
