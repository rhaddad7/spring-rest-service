#!/usr/bin/env bash
echo "Installing Pipeline" 
#export KUBECONFIG=../ocp-labs-manager/config/ocp-demo-cluster/ocp-install/auth/kubeconfig
oc login $CLUSTER_URL -u $OC_USERNAME -p $OC_PASSWORD
oc project cicd-tools

git checkout stage
oc apply -f .openshift/spring-boot-demo.yaml

git checkout qa
oc apply -f .openshift/spring-boot-demo.yaml
