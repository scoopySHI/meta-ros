# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Package for extracting the factory calibration from a UR robot and change it such that it can be used by ur_description to gain a correct URDF"
AUTHOR = "Felix Exner <exner@fzi.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_CN = "ur_robot_driver"
ROS_BPN = "ur_calibration"

ROS_BUILD_DEPENDS = " \
    libeigen \
    roscpp \
    ur-client-library \
    ur-robot-driver \
    yaml-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    libeigen \
    roscpp \
    ur-client-library \
    ur-robot-driver \
    yaml-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libeigen \
    roscpp \
    ur-client-library \
    ur-robot-driver \
    yaml-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/UniversalRobots/Universal_Robots_ROS_Driver-release/archive/release/noetic/ur_calibration/2.1.2-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/ur_calibration"
SRC_URI = "git://github.com/UniversalRobots/Universal_Robots_ROS_Driver-release;${ROS_BRANCH};protocol=https"
SRCREV = "2cf2c8163626765053456b545565f4af5f55135d"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}