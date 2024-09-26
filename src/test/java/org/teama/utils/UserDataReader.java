package org.teama.utils;

import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

public class UserDataReader {
    private Map<String, Map<String, String>> users;

    public UserDataReader() {
        String path = "config/resources/account/codease.user.yml";
        LoaderOptions loaderOptions = new LoaderOptions();
        Yaml yaml = new Yaml(new Constructor(loaderOptions));
        try (InputStream input = new FileInputStream(path)) {
            users = yaml.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getEmail() {
        return users.get("user").get("email").toString();
    }

    public String getPassword() {
        return users.get("user").get("password");
    }
}
