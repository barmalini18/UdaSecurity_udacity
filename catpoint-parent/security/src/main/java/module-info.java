module com.udacity.catpoint.security {
    requires com.udacity.catpoint.image;
    requires miglayout;
    requires java.desktop;
    requires java.logging;
    requires guava;
    requires com.google.gson;
    requires java.sql;
    requires java.prefs;
    opens com.udacity.security.data;
}