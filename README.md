
# Lyfe Cylcle

Lifecycle?

In Android, a lifecycle represents the different states that an application or component (like an activity or fragment) goes through from its creation to its destruction. Understanding the lifecycle is crucial for managing resources, handling UI updates, and ensuring that your app behaves as expected.

---

## Android Lifecycle States:

1. onCreate:

This is the first method called when an activity or fragment is created.
It's where you typically initialize variables and set up initial configurations.
```
 override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    // Your initialization code here
}  
```
2. onStart:

Called when the activity becomes visible to the user.
It's a good place to start animations or refresh the UI.
```
override fun onStart() {
    super.onStart()
    // Your code when the activity starts
}
```
3. onResume:

Called when the activity is about to interact with the user.
Ideal for starting services, acquiring resources, or resuming animations.
```
override fun onResume() {
    super.onResume()
    // Your code when the activity is resumed
}
```
4. onPause:

Called when the activity is no longer in the foreground (partially visible or not visible at all).
Save necessary data, stop animations, or release resources here.
```
override fun onPause() {
    super.onPause()
    // Your code when the activity is paused
}
```
5. onStop:

Called when the activity is no longer visible to the user.
Release resources that are not needed while the activity is not visible.
```
override fun onStop() {
    super.onStop()
    // Your code when the activity stops
}
```
6. onDestroy:

Called before the activity is destroyed.
Cleanup operations and release resources that won't be needed anymore.
```
override fun onDestroy() {
    super.onDestroy()
    // Your cleanup code here
}
```
---
### Why Does It Matter?

Understanding the Android lifecycle is crucial for managing your app's resources efficiently, ensuring a smooth user experience, and avoiding memory leaks. By implementing the appropriate lifecycle methods, you can handle tasks such as saving and restoring instance state, managing background tasks, and releasing resources appropriately.
