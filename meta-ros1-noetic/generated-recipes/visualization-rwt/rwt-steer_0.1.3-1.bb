# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The rwt_steer package"
AUTHOR = "Shingo Kitagawa <shingogo.5511@gmail.com>"
ROS_AUTHOR = "Shingo Kitagawa <shingogo.5511@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "visualization_rwt"
ROS_BPN = "rwt_steer"

ROS_BUILD_DEPENDS = " \
    rosbridge-server \
    roswww \
    rwt-utils-3rdparty \
    web-video-server \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    rosbridge-server \
    roswww \
    rwt-utils-3rdparty \
    web-video-server \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rosbridge-server \
    roswww \
    rwt-utils-3rdparty \
    web-video-server \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    image-publisher \
    roslaunch \
    rostest \
    rviz \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/visualization_rwt-release/archive/release/noetic/rwt_steer/0.1.3-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/rwt_steer"
SRC_URI = "git://github.com/tork-a/visualization_rwt-release;${ROS_BRANCH};protocol=https"
SRCREV = "0f1d22bd0c2ccfa05ca68de2f0b92c8530ae04ab"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
