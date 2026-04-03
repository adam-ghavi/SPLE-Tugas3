package aisco.notification;
import aisco.notification.core.Notification;

import java.lang.reflect.Constructor;
import java.util.logging.Logger;

public class NotificationFactory {

    private static final Logger LOGGER = Logger.getLogger(NotificationFactory.class.getName());

    private NotificationFactory() {
    }

    public static Notification createNotification(String fullyQualifiedName, Object... args) {
        Notification listener = null;
        try {
            Class<?> clz = Class.forName(fullyQualifiedName);
            Constructor<?> constructor = clz.getDeclaredConstructors()[0];
            listener = (Notification) constructor.newInstance(args);
        } catch (IllegalArgumentException e) {
            LOGGER.severe("Failed to create Notification.");
            LOGGER.severe("Given FQN: " + fullyQualifiedName);
            LOGGER.severe("Check constructor arguments.");
            System.exit(20);
        } catch (ClassCastException e) {
            LOGGER.severe("Failed to create Notification.");
            LOGGER.severe("Given FQN: " + fullyQualifiedName);
            LOGGER.severe("Class does not implement Notification.");
            System.exit(30);
        } catch (ClassNotFoundException e) {
            LOGGER.severe("Failed to create Notification.");
            LOGGER.severe("Given FQN: " + fullyQualifiedName);
            System.exit(40);
        } catch (Exception e) {
            LOGGER.severe("Failed to create Notification: " + e);
            LOGGER.severe("Given FQN: " + fullyQualifiedName);
            System.exit(50);
        }
        return listener;
    }
}
