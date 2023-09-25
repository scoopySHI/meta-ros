# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "C++ library for the base generic MRPT sensor node"
AUTHOR = "Jose-Luis Blanco-Claraco <jlblanco@ual.es>"
ROS_AUTHOR = "Jose-Luis Blanco-Claraco <jlblanco@ual.es>"
HOMEPAGE = "https://wiki.ros.org/mrpt_sensors"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "mrpt_sensors"
ROS_BPN = "mrpt_sensorlib"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    message-generation \
    mrpt-msgs \
    mrpt2 \
    ros-environment \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    message-generation \
    mrpt-msgs \
    mrpt2 \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    message-generation \
    message-runtime \
    mrpt-msgs \
    mrpt2 \
    roscpp \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/mrpt-ros-pkg-release/mrpt_sensors-release/archive/release/noetic/mrpt_sensorlib/0.0.3-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/mrpt_sensorlib"
SRC_URI = "git://github.com/mrpt-ros-pkg-release/mrpt_sensors-release;${ROS_BRANCH};protocol=https"
SRCREV = "cfeb7fe34c15b58ebd9eec4c9aef2725aee13aba"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
