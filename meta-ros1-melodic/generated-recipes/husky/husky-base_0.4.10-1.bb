# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Clearpath Husky robot driver"
AUTHOR = "Tony Baltovski <tbaltovski@clearpathrobotics.com>"
ROS_AUTHOR = "Mike Purvis <mpurvis@clearpathrobotics.com>"
HOMEPAGE = "http://ros.org/wiki/husky_base"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "husky"
ROS_BPN = "husky_base"

ROS_BUILD_DEPENDS = " \
    controller-manager \
    diagnostic-msgs \
    diagnostic-updater \
    hardware-interface \
    husky-msgs \
    roscpp \
    roslaunch \
    roslint \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    controller-manager \
    diagnostic-aggregator \
    diagnostic-msgs \
    diagnostic-updater \
    diff-drive-controller \
    geometry-msgs \
    hardware-interface \
    husky-control \
    husky-description \
    husky-msgs \
    roscpp \
    sensor-msgs \
    topic-tools \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    controller-manager \
    diagnostic-aggregator \
    diagnostic-msgs \
    diagnostic-updater \
    diff-drive-controller \
    geometry-msgs \
    hardware-interface \
    husky-control \
    husky-description \
    husky-msgs \
    roscpp \
    sensor-msgs \
    topic-tools \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/clearpath-gbp/husky-release/archive/release/melodic/husky_base/0.4.10-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/husky_base"
SRC_URI = "git://github.com/clearpath-gbp/husky-release;${ROS_BRANCH};protocol=https"
SRCREV = "ca0cfe2732123fac1ac65b73a36cab943a87d4f3"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}