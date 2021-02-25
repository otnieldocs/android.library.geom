# Androgeom

![](https://img.shields.io/badge/version-0.0.1-blue.svg) ![](https://travis-ci.org/joemccann/dillinger.svg?branch=master) 

Android geometry library including layout, primitive object, animated object, etc.

### Installation
TODO : Will publish this library to public maven repository

### Available Geom
Here are current geometry objects available to use

#### 1. RectangleLayout
Inhering ConstraintLayout with addition in full control of radius and custom background color. Note: for background color, use `app:backgroundColor` instead of `android:backgroundColor`.
##### How to use
Simply add RectangleLayout to your layout viewport precisely the same with ConstraintLayout. Just replace `ConstraintLayout` with `com.otnieldocs.androgeom.RectangleLayout`

```
<com.otnieldocs.androgeom.RectangleLayout
        android:layout_width="300dp"
        android:layout_height="120dp"
        android:layout_marginTop="32dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:backgroundColor="@color/purple_500"
        app:radiusTopLeft="16dp" />
```