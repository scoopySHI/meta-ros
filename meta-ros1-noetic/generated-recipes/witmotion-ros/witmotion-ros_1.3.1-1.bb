# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Standalone QT-based IMU/GPS decoder nodes for Witmotion UART-compatible sensor devices"
AUTHOR = "Andrey Vukolov <andrey.vukolov@elettra.eu>"
ROS_AUTHOR = "Andrey Vukolov <andrey.vukolov@elettra.eu>"
HOMEPAGE = "https://wiki.ros.org/witmotion_ros"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=92566b45c3390e5178465bcaade208b7"

ROS_CN = "witmotion_ros"
ROS_BPN = "witmotion_ros"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libqt5-serialport-dev} \
    geometry-msgs \
    message-runtime \
    nav-core \
    nav-msgs \
    roscpp \
    rosgraph-msgs \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libqt5-serialport-dev} \
    geometry-msgs \
    message-runtime \
    nav-core \
    nav-msgs \
    roscpp \
    rosgraph-msgs \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libqt5-serialport-dev} \
    geometry-msgs \
    message-runtime \
    nav-core \
    nav-msgs \
    roscpp \
    rosgraph-msgs \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/twdragon/witmotion_ros-release/archive/release/noetic/witmotion_ros/1.3.1-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/witmotion_ros"
SRC_URI = "git://github.com/twdragon/witmotion_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "96e3fcfc4ec5af5d907c495933bd7b2c6d3eb7e4"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
