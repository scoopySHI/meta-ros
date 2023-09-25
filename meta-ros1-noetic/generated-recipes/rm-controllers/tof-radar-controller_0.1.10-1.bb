# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The tof radar controller package"
AUTHOR = "luotinkai <luotinkai@todo.todo>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_CN = "rm_controllers"
ROS_BPN = "tof_radar_controller"

ROS_BUILD_DEPENDS = " \
    controller-interface \
    pluginlib \
    realtime-tools \
    rm-common \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    controller-interface \
    pluginlib \
    realtime-tools \
    rm-common \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    controller-interface \
    pluginlib \
    realtime-tools \
    rm-common \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/rm-controls/rm_controllers-release/archive/release/noetic/tof_radar_controller/0.1.10-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/tof_radar_controller"
SRC_URI = "git://github.com/rm-controls/rm_controllers-release;${ROS_BRANCH};protocol=https"
SRCREV = "ccb20ff79fbb38b806ba333f94c7014b0139dc8f"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
