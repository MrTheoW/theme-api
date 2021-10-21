package com.stream_pi.theme_api;

import com.stream_pi.theme_api.i18n.I18N;
import com.stream_pi.util.version.Version;

import java.util.Locale;

public class ThemeAPI
{
    public static final Version VERSION = new Version(1,0,0);
    public static final Version MIN_VERSION_SUPPORTED = new Version(1,0,0);

    public static void initI18n(Locale locale)
    {
        I18N.init(locale);
    }
}
