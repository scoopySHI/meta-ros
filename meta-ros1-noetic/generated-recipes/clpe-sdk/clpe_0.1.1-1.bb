# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "clpe sdk"
AUTHOR = "Dongwoo Sun <dwsun@can-lab.co.kr>"
ROS_AUTHOR = "Can-lab Corporation"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "clpe_sdk"
ROS_BPN = "clpe"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-iputils-ping} \
    ${ROS_UNRESOLVED_DEP-network-manager} \
    gstreamer1.0-plugins-base \
    net-tools \
    pkgconfig \
    procps \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-iputils-ping} \
    ${ROS_UNRESOLVED_DEP-network-manager} \
    gstreamer1.0-plugins-base \
    net-tools \
    procps \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-iputils-ping} \
    ${ROS_UNRESOLVED_DEP-network-manager} \
    gstreamer1.0-plugins-base \
    net-tools \
    procps \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/canlab-co/CLPE_G_NVP2650D_SDK-ros-release/archive/release/noetic/clpe/0.1.1-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/clpe"
SRC_URI = "git://github.com/canlab-co/CLPE_G_NVP2650D_SDK-ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "463b01d6c5db6b7755a268045b1b45b5f268791f"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
