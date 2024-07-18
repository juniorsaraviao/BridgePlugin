import { WebPlugin } from '@capacitor/core';

import type { BridgeNativePlugin } from './definitions';

export class BridgeNativeWeb extends WebPlugin implements BridgeNativePlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
