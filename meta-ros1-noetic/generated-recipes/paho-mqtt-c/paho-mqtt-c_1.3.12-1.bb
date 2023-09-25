# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Eclipse Paho C Client Library for the MQTT Protocol"
AUTHOR = "Tim Clephas <tim.clephas@nobleo.nl>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Eclipse Public License 2.0"
LICENSE = "EPL-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=76e678838ea433cb4c7268b6404f2076"

ROS_CN = "paho-mqtt-c"
ROS_BPN = "paho-mqtt-c"

ROS_BUILD_DEPENDS = " \
    openssl \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    openssl \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    openssl \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/nobleo/paho.mqtt.c-release/archive/release/noetic/paho-mqtt-c/1.3.12-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/paho-mqtt-c"
SRC_URI = "git://github.com/nobleo/paho.mqtt.c-release;${ROS_BRANCH};protocol=https"
SRCREV = "2cb33cd18df9a37d4f3fe4154787b45b41c2fa5f"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
