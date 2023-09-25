# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "SMACC is a ROS/C++ library to implement in easy and systematic way UML StateCharts (AKA state machines). SMACC is inspired by the SMACH ROS package and it is built on top of Boost StateChart library. Developed by Reel Robotics."
AUTHOR = "Pablo Inigo Blasco <pablo@ibrobotics.com>"
ROS_AUTHOR = "Pablo Inigo Blasco <pablo@ibrobotics.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "smacc"
ROS_BPN = "smacc"

ROS_BUILD_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    controller-manager-msgs \
    log4cxx \
    message-generation \
    pluginlib \
    ros-control \
    roscpp \
    smacc-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    controller-manager-msgs \
    log4cxx \
    pluginlib \
    ros-control \
    roscpp \
    smacc-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    controller-manager-msgs \
    log4cxx \
    message-runtime \
    pluginlib \
    ros-control \
    roscpp \
    smacc-msgs \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/robosoft-ai/smacc-release/archive/release/noetic/smacc/1.4.6-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/smacc"
SRC_URI = "git://github.com/robosoft-ai/smacc-release;${ROS_BRANCH};protocol=https"
SRCREV = "eadf6941e6fb7929675bf1d6714ab2ae846d6d18"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
