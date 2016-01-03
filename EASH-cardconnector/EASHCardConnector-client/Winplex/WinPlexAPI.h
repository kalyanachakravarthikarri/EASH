////////////////////////////////////////////////////////////////////
//                                                                //
//   WinPlex API Version 1.20 C/C++ Header file                   //
//                                                                //
////////////////////////////////////////////////////////////////////

#ifndef __WINPLEXAPI_H__
#define __WINPLEXAPI_H__

// Setup defines
#ifndef DLLIMPORT
#define DLLIMPORT _declspec(dllimport) _stdcall
#endif

#ifndef UCHAR
#define UCHAR unsigned char
#endif

#ifndef ULONG
#define ULONG unsigned long
#endif

////////////////////////////////////////////////////////////////////
// Error Codes
////////////////////////////////////////////////////////////////////
#define	CLXERR_NO_ERROR		0
#define	CLXERR_API_ERROR		-1	// 0xFFFF or 0xFFFFFFFF depending on data type

////////////////////////////////////////////////////////////////////
// Card Types
////////////////////////////////////////////////////////////////////
#define	CTYPE_CPU			0
#define	CTYPE_B1				1
#define	CTYPE_B2				2
#define	CTYPE_B6				3
#define	CTYPE_A1				4
#define	CTYPE_K1				5
#define	CTYPE_A2				6
#define	CTYPE_E1				7
#define	CTYPE_D1				8
#define	CTYPE_B5				9
#define	CTYPE_A6				10
#define	CTYPE_D2				11
#define	CTYPE_E2				12
#define	CTYPE_A7				13
#define	CTYPE_B3				14
#define	CTYPE_B4				15
#define	CTYPE_E3				16
#define	CTYPE_A8				17
#define	CTYPE_J7				18
#define	CTYPE_A9				19
#define	CTYPE_A3				20
#define	CTYPE_E4				21
#define	CTYPE_E6				22
#define	CTYPE_A5				23
#define	CTYPE_J6				24
#define	CTYPE_K2				25
#define	CTYPE_A4				26
#define	CTYPE_M1				27
#define	CTYPE_K4				28
#define CTYPE_D5				29


////////////////////////////////////////////////////////////////////
// Password Types
////////////////////////////////////////////////////////////////////
#define	PWD_DEFAULT				0
#define	PWD_READ				1
#define	PWD_WRITE				2
#define	PWD_ERASE				3

////////////////////////////////////////////////////////////////////
// Reader Types
////////////////////////////////////////////////////////////////////
#define	RTYPE_AXIOHM				1
#define	RTYPE_ST100					2
#define	RTYPE_ST110					3
#define	RTYPE_KDM9902				4
#define	RTYPE_KDM9908				5
#define	RTYPE_TOWITOKO				6
#define	RTYPE_SCM_PCMCIA			7
#define	RTYPE_INNOVONICS			8
#define	RTYPE_AXIOHM154				9
#define	RTYPE_PCSC				  	10		// PCSC - WINSCARD API (WinSDK)
#define	RTYPE_PRECISEBIO		  	11		// Precise Biometrics
#define	RTYPE_IDTECH			  	12		// IDTech Spectrum I
#define	RTYPE_IDTECH2			  	13		// IDTech Spectrum II

////////////////////////////////////////////////////////////////////
// Define ISO Status/Return Codes
////////////////////////////////////////////////////////////////////
#define	ISO_SUCCESS				36864	// 9000h  - Success

////////////////////////////////////////////////////////////////////
// API Functions
////////////////////////////////////////////////////////////////////
#ifdef __cplusplus
extern "C"{
#endif

// General Calls
long DLLIMPORT CLX_APIVersion( UCHAR *rdata );
long DLLIMPORT CLX_OpenReader(ULONG portNum, ULONG readerType, ULONG baud);
long DLLIMPORT CLX_CloseReader(long portHandle);
long DLLIMPORT CLX_GetError(long portHandle);
long DLLIMPORT CLX_SetCardType(long portHandle, ULONG cardType);
long DLLIMPORT CLX_ResetReader(long portHandle);
long DLLIMPORT CLX_CardInserted(long portHandle);
long DLLIMPORT CLX_SetReaderLed(long portHandle, ULONG redGreen, ULONG status);
long DLLIMPORT CLX_GetReaderVersion(long portHandle, UCHAR *rdata);
long DLLIMPORT CLX_GetReaderName(long ReaderIndex, unsigned char *ReaderName, long NameSize);
long DLLIMPORT CLX_GetReaderStatus(long portHandle);
long DLLIMPORT CLX_GetReaderConfig(long portHandle);
long DLLIMPORT CLX_GetCardStatus(long portHandle, UCHAR *rdata);
long DLLIMPORT CLX_SetCardPageMode(long portHandle, long mode);
long DLLIMPORT CLX_LatchReader(long portHandle);
long DLLIMPORT CLX_UnlatchReader(long portHandle);

// Memory Card Calls
long DLLIMPORT CLX_ReadCard(long portHandle, UCHAR *rdata, ULONG addr, ULONG len);
long DLLIMPORT CLX_WriteCard(long portHandle, UCHAR *rdata, ULONG addr, ULONG len);
long DLLIMPORT CLX_ReadCardToFile(long portHandle, ULONG addr, ULONG len, LPVOID fname);
long DLLIMPORT CLX_WriteCardFromFile(long portHandle, ULONG addr, ULONG len, LPVOID fname);
long DLLIMPORT CLX_VerifyPassword(long portHandle, ULONG pwdType, UCHAR *pwdData);
long DLLIMPORT CLX_ChangePassword(long portHandle, ULONG pwdType, UCHAR *origPwdData, UCHAR *newPwdData);
long DLLIMPORT CLX_VerifyPin(long portHandle, UCHAR *pindata, ULONG errcnt, ULONG pinaddr, ULONG pinlen);
long DLLIMPORT CLX_Erase(long portHandle);
long DLLIMPORT CLX_ErasePwd(long portHandle, UCHAR *erase_pwd);
long DLLIMPORT CLX_EraseBinary(long portHandle, ULONG addr, ULONG len);

long DLLIMPORT CLX_VerifyK1Password(long portHandle, UCHAR *pwddata);
long DLLIMPORT CLX_ReadK1SZ(long portHandle, UCHAR *rdata, ULONG len);
long DLLIMPORT CLX_EraseK1AZ(long portHandle, UCHAR *erase_pwd, ULONG erase_count);
long DLLIMPORT CLX_GetK1EC(long portHandle, long *erase_count);
long DLLIMPORT CLX_VerifyK2Password(long portHandle, UCHAR *pwddata);
long DLLIMPORT CLX_EraseK2AZ1(long portHandle, UCHAR *erase_pwd, ULONG erase_count);
long DLLIMPORT CLX_EraseK2AZ2(long portHandle, UCHAR *erase_pwd, ULONG erase_count);
long DLLIMPORT CLX_GetK2EC(long portHandle, long *erase_count);
long DLLIMPORT CLX_VerifyB5Password(long portHandle, UCHAR *pwddata);
long DLLIMPORT CLX_ReadB5Card(long portHandle, UCHAR *rdata, ULONG addr, ULONG len);
long DLLIMPORT CLX_WriteB5Card(long portHandle, UCHAR *rdata, ULONG addr, ULONG len);

#define D2_READ_BINARY           0
#define D2_READ_BINARY_PASS      1
#define D2_READ_BINARY_CFG_PASS  2

long DLLIMPORT CLX_WriteD2Card(long portHandle, UCHAR *rdata, ULONG addr, ULONG len);
long DLLIMPORT CLX_WriteD2CardPass(long portHandle, UCHAR *rdata, ULONG addr, ULONG len);
long DLLIMPORT CLX_WriteD2CardFromFile(long portHandle, ULONG addr, ULONG len, LPVOID fname);
long DLLIMPORT CLX_WriteD2CardFromFilePass(long portHandle, ULONG addr, ULONG len, LPVOID fname);
long DLLIMPORT CLX_ReadD2Card(long portHandle, long pwd_flag, UCHAR *rdata, ULONG addr, ULONG len);
long DLLIMPORT CLX_ReadD2CardToFilePass(long portHandle, ULONG addr, ULONG len, LPVOID fname);
long DLLIMPORT CLX_ProgD2Config(long portHandle, UCHAR *rdata);
long DLLIMPORT CLX_ReadD2Config(long portHandle, UCHAR *rdata);
long DLLIMPORT CLX_D2MassErase(long portHandle);
long DLLIMPORT CLX_D2MassProgram(long portHandle);
long DLLIMPORT CLX_SetD2Pass(long portHandle, long cmd_type, UCHAR *newpass);
long DLLIMPORT CLX_LoadD2Password(long portHandle, LPVOID rdata);
long DLLIMPORT CLX_LoadB1Password(long portHandle, UCHAR *rdata);
long DLLIMPORT CLX_EraseB1Memory(long portHandle, ULONG addr, ULONG len);
long DLLIMPORT CLX_EraseB1User(long portHandle);
long DLLIMPORT CLX_ReadB1Value(long portHandle, long *value);
long DLLIMPORT CLX_DecB1Value(long portHandle);
long DLLIMPORT CLX_ReadB3Protect(long portHandle, UCHAR *rdata, ULONG addr, ULONG len);
long DLLIMPORT CLX_WriteB3Protect(long portHandle, UCHAR *rdata, ULONG addr, ULONG len);

// Microprocessor Card Calls
long DLLIMPORT CLX_CardOn(long portHandle, UCHAR *rdata, ULONG *atrlength);
long DLLIMPORT CLX_CardOnNoPTS(long portHandle, UCHAR *rdata);
long DLLIMPORT CLX_CardOff(long portHandle);
long DLLIMPORT CLX_Write7816(long portHandle, ULONG CLA, ULONG INS, ULONG P1, ULONG P2, ULONG P3, UCHAR *rdata);
long DLLIMPORT CLX_Read7816(long portHandle, ULONG CLA, ULONG INS, ULONG P1, ULONG P2, ULONG P3, UCHAR *rdata);
long DLLIMPORT CLX_Select7816(long portHandle, ULONG P3, UCHAR *rdata);
long DLLIMPORT CLX_Select(long portHandle, ULONG FileNum);
long DLLIMPORT CLX_Verify7816(long portHandle, ULONG P3, UCHAR *rdata);
long DLLIMPORT CLX_Invalidate7816(long portHandle);
long DLLIMPORT CLX_ReadBinary7816(long portHandle, ULONG offset, ULONG P3, UCHAR *rdata);
long DLLIMPORT CLX_WriteBinary7816(long portHandle, ULONG offset, ULONG P3, UCHAR *rdata);
long DLLIMPORT CLX_UpdateBinary7816(long portHandle, ULONG offset, ULONG P3, UCHAR *rdata);
long DLLIMPORT CLX_Rehab7816(long portHandle);

long DLLIMPORT CLX_GetChallenge7816(long portHandle, ULONG len, UCHAR *rdata);

long DLLIMPORT CLX_ExternalAuth7816(long portHandle, UCHAR *rdata);
long DLLIMPORT CLX_InternalAuth7816(long portHandle, UCHAR *rdata);
long DLLIMPORT CLX_GetResponse7816(long portHandle, UCHAR *rdata);

// Sha Calls
long DLLIMPORT CLX_Sha1(UCHAR *chal, UCHAR *pwd, UCHAR *sha);
long DLLIMPORT CLX_ShaInternal(UCHAR *chal, UCHAR *pwd, UCHAR *sha);

// Purse Calls
long DLLIMPORT CLX_PurseVal(long portHandle, ULONG *pvalue);
long DLLIMPORT CLX_PurseDep(long portHandle, ULONG value);
long DLLIMPORT CLX_PurseWdl(long portHandle, ULONG value);

long DLLIMPORT CLX_PurseInit(long portHandle, UCHAR *pvalue);
long DLLIMPORT CLX_PurseVal_Secure(long portHandle, UCHAR *pursechal, UCHAR *session, ULONG *pvalue);
long DLLIMPORT CLX_PurseDep_Secure(long portHandle, UCHAR *pursechal, UCHAR *session, ULONG value);
long DLLIMPORT CLX_PurseWdl_Secure(long portHandle, UCHAR *pursechal, UCHAR *session, ULONG value);

// Secure Calls
long DLLIMPORT CLX_GenerateKey(long portHandle, ULONG secret, ULONG keyreg, UCHAR *sk, UCHAR *challenge, UCHAR *session);
long DLLIMPORT CLX_SetEncryption(long portHandle, ULONG alg, ULONG key);
long DLLIMPORT CLX_ReadSecure(long portHandle, ULONG offset, ULONG P3, UCHAR *rdata);
long DLLIMPORT CLX_WriteSecure(long portHandle, ULONG offset, ULONG P3, UCHAR *rdata);
long DLLIMPORT CLX_UpdateSecure(long portHandle, ULONG offset, ULONG P3, UCHAR *rdata);
long DLLIMPORT CLX_SetKey(long portHandle, ULONG keyreg, ULONG P3, UCHAR *rdata);

// DES Encryption Calls
int DLLIMPORT CLX_DesEncrypt(UCHAR *block, UCHAR *key, unsigned int length);
int DLLIMPORT CLX_DesDecrypt(UCHAR *block, UCHAR *key, unsigned int length);
int DLLIMPORT CLX_3DesEncrypt(UCHAR *block, UCHAR *key, unsigned int length);
int DLLIMPORT CLX_3DesDecrypt(UCHAR *block, UCHAR *key, unsigned int length);

// AES Encryption Calls
int DLLIMPORT CLX_AesDecrypt( unsigned char *block, short length, unsigned char *key, int keyBits);
int DLLIMPORT CLX_AesEncrypt( unsigned char *block, short length, unsigned char *key, int keyBits);

// C0 Calls
long DLLIMPORT CLX_C0ExternalAuth(long portHandle, UCHAR *chal, UCHAR *pwd);
long DLLIMPORT CLX_C0InternalAuth(long portHandle, UCHAR *rdata);
long DLLIMPORT CLX_C0GetResponse(long portHandle, UCHAR *rdata);

long DLLIMPORT CLX_SendPTS(long portHandle, ULONG P3, UCHAR *rdata);

// Magstripe Calls
long DLLIMPORT CLX_EnableKeyboard(long portHandle);
long DLLIMPORT CLX_DisableKeyboard(long portHandle);
long DLLIMPORT CLX_StartMagCard(long portHandle, long trackNum);
long DLLIMPORT CLX_StopMagCard(long portHandle);
long DLLIMPORT CLX_GetMagData(long portHandle, UCHAR *rdata, long *dataLen);

// FingerPrint Calls
long DLLIMPORT CLX_FingerPrintOpen(long readerType);
long DLLIMPORT CLX_FingerPrintClose(void);
long DLLIMPORT CLX_FingerPrintEnroll(UCHAR *Template, long *TemplateSize);
long DLLIMPORT CLX_FingerPrintVerify(UCHAR *Template, long ReScan);
long DLLIMPORT CLX_FingerPrintImage(HBITMAP * Image);

#ifdef __cplusplus
}
#endif

#endif	// __WINPLEXAPI_H__