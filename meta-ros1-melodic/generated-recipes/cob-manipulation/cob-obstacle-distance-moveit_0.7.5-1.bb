# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This package provides nodes for calculating the minimal distance to robot links, obstacles and octomap using MoveIt!'s PlanningSceneMonitor"
AUTHOR = "Felix Messmer <fxm@ipa.fhg.de>"
ROS_AUTHOR = "Florian Koehler <koellsch86@googlemail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=80318c4afef111a7690eaf237460856b"

ROS_CN = "cob_manipulation"
ROS_BPN = "cob_obstacle_distance_moveit"

ROS_BUILD_DEPENDS = " \
    boost \
    cob-control-msgs \
    cob-srvs \
    eigen-conversions \
    fcl \
    geometric-shapes \
    geometry-msgs \
    moveit-core \
    moveit-msgs \
    moveit-ros-perception \
    moveit-ros-planning-interface \
    pkgconfig \
    roscpp \
    tf \
    tf-conversions \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    cob-control-msgs \
    cob-srvs \
    eigen-conversions \
    fcl \
    geometric-shapes \
    geometry-msgs \
    moveit-core \
    moveit-msgs \
    moveit-ros-perception \
    moveit-ros-planning-interface \
    pkgconfig \
    roscpp \
    tf \
    tf-conversions \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    cob-control-msgs \
    cob-moveit-bringup \
    cob-moveit-config \
    cob-srvs \
    eigen-conversions \
    fcl \
    geometric-shapes \
    geometry-msgs \
    moveit-core \
    moveit-msgs \
    moveit-ros-perception \
    moveit-ros-planning-interface \
    pkgconfig \
    roscpp \
    rospy \
    tf \
    tf-conversions \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ipa320/cob_manipulation-release/archive/release/melodic/cob_obstacle_distance_moveit/0.7.5-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/cob_obstacle_distance_moveit"
SRC_URI = "git://github.com/ipa320/cob_manipulation-release;${ROS_BRANCH};protocol=https"
SRCREV = "4f1d0e33588c861988f8c23fcb693f6d6720b80b"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}