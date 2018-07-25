'use strict';

import React from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  Button,
  NativeModules,
  View
} from 'react-native';

class HelloWorld extends React.Component {

  render() {
    return (
      <View style={styles.container}>
        <Button title="Load Unity Game" onPress={() => { NativeModules.UnityLauncher.launchIntent()}} />
      </View>
    )
  }
}
var styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
  },
  hello: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
  },
});

AppRegistry.registerComponent('ReactNextDemo', () => HelloWorld);