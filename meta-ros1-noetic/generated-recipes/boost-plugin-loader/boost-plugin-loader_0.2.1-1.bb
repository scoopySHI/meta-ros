# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Boost plugin loader implementation"
AUTHOR = "Levi Armstrong <levi.armstrong@gmail.com>"
ROS_AUTHOR = "Levi Armstrong <levi.armstrong@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "boost_plugin_loader"
ROS_BPN = "boost_plugin_loader"

ROS_BUILD_DEPENDS = " \
    boost \
    ros-industrial-cmake-boilerplate \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    gtest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tesseract-robotics-release/boost_plugin_loader-release/archive/release/noetic/boost_plugin_loader/0.2.1-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/boost_plugin_loader"
SRC_URI = "git://github.com/tesseract-robotics-release/boost_plugin_loader-release;${ROS_BRANCH};protocol=https"
SRCREV = "9e7e5c0676e2544a607ff7d9081263482a71e28f"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
