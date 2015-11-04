/**
 */
package codingExperimentOntology.apparatus.impl;

import codingExperimentOntology.apparatus.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NewPackage4FactoryImpl extends EFactoryImpl implements NewPackage4Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NewPackage4Factory init() {
		try {
			NewPackage4Factory theNewPackage4Factory = (NewPackage4Factory)EPackage.Registry.INSTANCE.getEFactory(NewPackage4Package.eNS_URI);
			if (theNewPackage4Factory != null) {
				return theNewPackage4Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NewPackage4FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewPackage4FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case NewPackage4Package.CODING_ARTIFACT: return createCodingArtifact();
			case NewPackage4Package.RESOURCE_MONITOR_INSTRUMENT: return createResourceMonitorInstrument();
			case NewPackage4Package.TIME_MONITOR_BY_RESOURCE: return createTimeMonitorByResource();
			case NewPackage4Package.TIME_MONITOR_BY_TASK: return createTimeMonitorByTask();
			case NewPackage4Package.TIME_MONITOR_BY_PROCESS: return createTimeMonitorByProcess();
			case NewPackage4Package.QUESTIONARY_BY_TASK: return createQuestionaryByTask();
			case NewPackage4Package.QUESTIONNAIRE_BY_PROCESS: return createQuestionnaireByProcess();
			case NewPackage4Package.QUESTION_CONTENT: return createQuestionContent();
			case NewPackage4Package.FIELD: return createField();
			case NewPackage4Package.CHOICE: return createChoice();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case NewPackage4Package.CODING_ARTIFACT_TYPES:
				return createCodingArtifactTypesFromString(eDataType, initialValue);
			case NewPackage4Package.QUESTIONNARIE_ALLOCATION:
				return createQuestionnarieAllocationFromString(eDataType, initialValue);
			case NewPackage4Package.CHOICE_TYPES:
				return createChoiceTypesFromString(eDataType, initialValue);
			case NewPackage4Package.FIELD_TYPES:
				return createFieldTypesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case NewPackage4Package.CODING_ARTIFACT_TYPES:
				return convertCodingArtifactTypesToString(eDataType, instanceValue);
			case NewPackage4Package.QUESTIONNARIE_ALLOCATION:
				return convertQuestionnarieAllocationToString(eDataType, instanceValue);
			case NewPackage4Package.CHOICE_TYPES:
				return convertChoiceTypesToString(eDataType, instanceValue);
			case NewPackage4Package.FIELD_TYPES:
				return convertFieldTypesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodingArtifact createCodingArtifact() {
		CodingArtifactImpl codingArtifact = new CodingArtifactImpl();
		return codingArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceMonitorInstrument createResourceMonitorInstrument() {
		ResourceMonitorInstrumentImpl resourceMonitorInstrument = new ResourceMonitorInstrumentImpl();
		return resourceMonitorInstrument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeMonitorByResource createTimeMonitorByResource() {
		TimeMonitorByResourceImpl timeMonitorByResource = new TimeMonitorByResourceImpl();
		return timeMonitorByResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeMonitorByTask createTimeMonitorByTask() {
		TimeMonitorByTaskImpl timeMonitorByTask = new TimeMonitorByTaskImpl();
		return timeMonitorByTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeMonitorByProcess createTimeMonitorByProcess() {
		TimeMonitorByProcessImpl timeMonitorByProcess = new TimeMonitorByProcessImpl();
		return timeMonitorByProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionaryByTask createQuestionaryByTask() {
		QuestionaryByTaskImpl questionaryByTask = new QuestionaryByTaskImpl();
		return questionaryByTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireByProcess createQuestionnaireByProcess() {
		QuestionnaireByProcessImpl questionnaireByProcess = new QuestionnaireByProcessImpl();
		return questionnaireByProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionContent createQuestionContent() {
		QuestionContentImpl questionContent = new QuestionContentImpl();
		return questionContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choice createChoice() {
		ChoiceImpl choice = new ChoiceImpl();
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodingArtifactTypes createCodingArtifactTypesFromString(EDataType eDataType, String initialValue) {
		CodingArtifactTypes result = CodingArtifactTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodingArtifactTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnarieAllocation createQuestionnarieAllocationFromString(EDataType eDataType, String initialValue) {
		QuestionnarieAllocation result = QuestionnarieAllocation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnarieAllocationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceTypes createChoiceTypesFromString(EDataType eDataType, String initialValue) {
		ChoiceTypes result = ChoiceTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChoiceTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldTypes createFieldTypesFromString(EDataType eDataType, String initialValue) {
		FieldTypes result = FieldTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFieldTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewPackage4Package getNewPackage4Package() {
		return (NewPackage4Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NewPackage4Package getPackage() {
		return NewPackage4Package.eINSTANCE;
	}

} //NewPackage4FactoryImpl
