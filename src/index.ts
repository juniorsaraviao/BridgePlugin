import { registerPlugin } from '@capacitor/core';

import type { BridgeNativePlugin } from './definitions';

const BridgeNative = registerPlugin<BridgeNativePlugin>('BridgeNative', {
  web: () => import('./web').then(m => new m.BridgeNativeWeb()),
});

export * from './definitions';
export { BridgeNative };
