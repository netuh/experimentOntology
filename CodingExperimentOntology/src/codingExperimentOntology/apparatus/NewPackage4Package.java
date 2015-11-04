/**
 */
package codingExperimentOntology.apparatus;

import experimentOntology.planning.PlanningPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see codingExperimentOntology.apparatus.NewPackage4Factory
 * @model kind="package"
 * @generated
 */
public interface NewPackage4Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "apparatus";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "apparatus";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "apparatus";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NewPackage4Package eINSTANCE = codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl.init();

	/**
	 * The meta object id for the '{@link codingExperimentOntology.apparatus.impl.CodignApparatusImpl <em>Codign Apparatus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.apparatus.impl.CodignApparatusImpl
	 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getCodignApparatus()
	 * @generated
	 */
	int CODIGN_APPARATUS = 0;

	/**
	 * The number of structural features of the '<em>Codign Apparatus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODIGN_APPARATUS_FEATURE_COUNT = PlanningPackage.APPARATUS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Codign Apparatus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODIGN_APPARATUS_OPERATION_COUNT = PlanningPackage.APPARATUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingExperimentOntology.apparatus.impl.CodingArtifactImpl <em>Coding Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.apparatus.impl.CodingArtifactImpl
	 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getCodingArtifact()
	 * @generated
	 */
	int CODING_ARTIFACT = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_ARTIFACT__TYPE = CODIGN_APPARATUS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Coding Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_ARTIFACT_FEATURE_COUNT = CODIGN_APPARATUS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Coding Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_ARTIFACT_OPERATION_COUNT = CODIGN_APPARATUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingExperimentOntology.apparatus.impl.CodingInstrumentImpl <em>Coding Instrument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.apparatus.impl.CodingInstrumentImpl
	 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getCodingInstrument()
	 * @generated
	 */
	int CODING_INSTRUMENT = 2;

	/**
	 * The number of structural features of the '<em>Coding Instrument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_INSTRUMENT_FEATURE_COUNT = CODIGN_APPARATUS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Coding Instrument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_INSTRUMENT_OPERATION_COUNT = CODIGN_APPARATUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingExperimentOntology.apparatus.impl.ResourceMonitorInstrumentImpl <em>Resource Monitor Instrument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.apparatus.impl.ResourceMonitorInstrumentImpl
	 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getResourceMonitorInstrument()
	 * @generated
	 */
	int RESOURCE_MONITOR_INSTRUMENT = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MONITOR_INSTRUMENT__TARGET = CODING_INSTRUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Creation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MONITOR_INSTRUMENT__CREATION = CODING_INSTRUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MONITOR_INSTRUMENT__MODIFICATION = CODING_INSTRUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Delete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MONITOR_INSTRUMENT__DELETE = CODING_INSTRUMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Resource Monitor Instrument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MONITOR_INSTRUMENT_FEATURE_COUNT = CODING_INSTRUMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Resource Monitor Instrument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MONITOR_INSTRUMENT_OPERATION_COUNT = CODING_INSTRUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingExperimentOntology.apparatus.impl.TimeMonitorInstrumentImpl <em>Time Monitor Instrument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.apparatus.impl.TimeMonitorInstrumentImpl
	 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getTimeMonitorInstrument()
	 * @generated
	 */
	int TIME_MONITOR_INSTRUMENT = 4;

	/**
	 * The number of structural features of the '<em>Time Monitor Instrument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_MONITOR_INSTRUMENT_FEATURE_COUNT = CODING_INSTRUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time Monitor Instrument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_MONITOR_INSTRUMENT_OPERATION_COUNT = CODING_INSTRUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingExperimentOntology.apparatus.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.apparatus.impl.QuestionnaireImpl
	 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getQuestionnaire()
	 * @generated
	 */
	int QUESTIONNAIRE = 5;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__QUESTIONS = CODING_INSTRUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__ALLOCATION = CODING_INSTRUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Questionnaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_FEATURE_COUNT = CODING_INSTRUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Questionnaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_OPERATION_COUNT = CODING_INSTRUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingExperimentOntology.apparatus.impl.TimeMonitorByResourceImpl <em>Time Monitor By Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.apparatus.impl.TimeMonitorByResourceImpl
	 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getTimeMonitorByResource()
	 * @generated
	 */
	int TIME_MONITOR_BY_RESOURCE = 6;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_MONITOR_BY_RESOURCE__ARTIFACT = TIME_MONITOR_INSTRUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time Monitor By Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_MONITOR_BY_RESOURCE_FEATURE_COUNT = TIME_MONITOR_INSTRUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Time Monitor By Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_MONITOR_BY_RESOURCE_OPERATION_COUNT = TIME_MONITOR_INSTRUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingExperimentOntology.apparatus.impl.TimeMonitorByTaskImpl <em>Time Monitor By Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.apparatus.impl.TimeMonitorByTaskImpl
	 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getTimeMonitorByTask()
	 * @generated
	 */
	int TIME_MONITOR_BY_TASK = 7;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_MONITOR_BY_TASK__TASK = TIME_MONITOR_INSTRUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time Monitor By Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_MONITOR_BY_TASK_FEATURE_COUNT = TIME_MONITOR_INSTRUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Time Monitor By Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_MONITOR_BY_TASK_OPERATION_COUNT = TIME_MONITOR_INSTRUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingExperimentOntology.apparatus.impl.TimeMonitorByProcessImpl <em>Time Monitor By Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.apparatus.impl.TimeMonitorByProcessImpl
	 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getTimeMonitorByProcess()
	 * @generated
	 */
	int TIME_MONITOR_BY_PROCESS = 8;

	/**
	 * The number of structural features of the '<em>Time Monitor By Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_MONITOR_BY_PROCESS_FEATURE_COUNT = TIME_MONITOR_INSTRUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time Monitor By Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_MONITOR_BY_PROCESS_OPERATION_COUNT = TIME_MONITOR_INSTRUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingExperimentOntology.apparatus.impl.TaskRelatedImpl <em>Task Related</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.apparatus.impl.TaskRelatedImpl
	 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getTaskRelated()
	 * @generated
	 */
	int TASK_RELATED = 9;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RELATED__TASK = 0;

	/**
	 * The number of structural features of the '<em>Task Related</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RELATED_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Task Related</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RELATED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link codingExperimentOntology.apparatus.impl.ProcessRelatedImpl <em>Process Related</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.apparatus.impl.ProcessRelatedImpl
	 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getProcessRelated()
	 * @generated
	 */
	int PROCESS_RELATED = 10;

	/**
	 * The number of structural features of the '<em>Process Related</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RELATED_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Process Related</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RELATED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link codingExperimentOntology.apparatus.impl.QuestionaryByTaskImpl <em>Questionary By Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.apparatus.impl.QuestionaryByTaskImpl
	 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getQuestionaryByTask()
	 * @generated
	 */
	int QUESTIONARY_BY_TASK = 11;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONARY_BY_TASK__TASK = TASK_RELATED__TASK;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONARY_BY_TASK__QUESTIONS = TASK_RELATED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONARY_BY_TASK__ALLOCATION = TASK_RELATED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Questionary By Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONARY_BY_TASK_FEATURE_COUNT = TASK_RELATED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Questionary By Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONARY_BY_TASK_OPERATION_COUNT = TASK_RELATED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingExperimentOntology.apparatus.impl.QuestionnaireByProcessImpl <em>Questionnaire By Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.apparatus.impl.QuestionnaireByProcessImpl
	 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getQuestionnaireByProcess()
	 * @generated
	 */
	int QUESTIONNAIRE_BY_PROCESS = 12;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_BY_PROCESS__QUESTIONS = PROCESS_RELATED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_BY_PROCESS__ALLOCATION = PROCESS_RELATED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Questionnaire By Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_BY_PROCESS_FEATURE_COUNT = PROCESS_RELATED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Questionnaire By Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_BY_PROCESS_OPERATION_COUNT = PROCESS_RELATED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingExperimentOntology.apparatus.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.apparatus.impl.QuestionImpl
	 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 13;

	/**
	 * The feature id for the '<em><b>Enunciation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__ENUNCIATION = 0;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link codingExperimentOntology.apparatus.impl.QuestionContentImpl <em>Question Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.apparatus.impl.QuestionContentImpl
	 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getQuestionContent()
	 * @generated
	 */
	int QUESTION_CONTENT = 14;

	/**
	 * The number of structural features of the '<em>Question Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_CONTENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Question Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link codingExperimentOntology.apparatus.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.apparatus.impl.FieldImpl
	 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getField()
	 * @generated
	 */
	int FIELD = 15;

	/**
	 * The feature id for the '<em><b>Enunciation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ENUNCIATION = QUESTION__ENUNCIATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingExperimentOntology.apparatus.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.apparatus.impl.ChoiceImpl
	 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 16;

	/**
	 * The feature id for the '<em><b>Enunciation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__ENUNCIATION = QUESTION__ENUNCIATION;

	/**
	 * The feature id for the '<em><b>Choices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__CHOICES = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__TYPE = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingExperimentOntology.apparatus.CodingArtifactTypes <em>Coding Artifact Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.apparatus.CodingArtifactTypes
	 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getCodingArtifactTypes()
	 * @generated
	 */
	int CODING_ARTIFACT_TYPES = 17;

	/**
	 * The meta object id for the '{@link codingExperimentOntology.apparatus.QuestionnarieAllocation <em>Questionnarie Allocation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.apparatus.QuestionnarieAllocation
	 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getQuestionnarieAllocation()
	 * @generated
	 */
	int QUESTIONNARIE_ALLOCATION = 18;

	/**
	 * The meta object id for the '{@link codingExperimentOntology.apparatus.ChoiceTypes <em>Choice Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.apparatus.ChoiceTypes
	 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getChoiceTypes()
	 * @generated
	 */
	int CHOICE_TYPES = 19;

	/**
	 * The meta object id for the '{@link codingExperimentOntology.apparatus.FieldTypes <em>Field Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.apparatus.FieldTypes
	 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getFieldTypes()
	 * @generated
	 */
	int FIELD_TYPES = 20;


	/**
	 * Returns the meta object for class '{@link codingExperimentOntology.apparatus.CodignApparatus <em>Codign Apparatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Codign Apparatus</em>'.
	 * @see codingExperimentOntology.apparatus.CodignApparatus
	 * @generated
	 */
	EClass getCodignApparatus();

	/**
	 * Returns the meta object for class '{@link codingExperimentOntology.apparatus.CodingArtifact <em>Coding Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coding Artifact</em>'.
	 * @see codingExperimentOntology.apparatus.CodingArtifact
	 * @generated
	 */
	EClass getCodingArtifact();

	/**
	 * Returns the meta object for the attribute '{@link codingExperimentOntology.apparatus.CodingArtifact#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see codingExperimentOntology.apparatus.CodingArtifact#getType()
	 * @see #getCodingArtifact()
	 * @generated
	 */
	EAttribute getCodingArtifact_Type();

	/**
	 * Returns the meta object for class '{@link codingExperimentOntology.apparatus.CodingInstrument <em>Coding Instrument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coding Instrument</em>'.
	 * @see codingExperimentOntology.apparatus.CodingInstrument
	 * @generated
	 */
	EClass getCodingInstrument();

	/**
	 * Returns the meta object for class '{@link codingExperimentOntology.apparatus.ResourceMonitorInstrument <em>Resource Monitor Instrument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Monitor Instrument</em>'.
	 * @see codingExperimentOntology.apparatus.ResourceMonitorInstrument
	 * @generated
	 */
	EClass getResourceMonitorInstrument();

	/**
	 * Returns the meta object for the reference list '{@link codingExperimentOntology.apparatus.ResourceMonitorInstrument#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see codingExperimentOntology.apparatus.ResourceMonitorInstrument#getTarget()
	 * @see #getResourceMonitorInstrument()
	 * @generated
	 */
	EReference getResourceMonitorInstrument_Target();

	/**
	 * Returns the meta object for the attribute '{@link codingExperimentOntology.apparatus.ResourceMonitorInstrument#isCreation <em>Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation</em>'.
	 * @see codingExperimentOntology.apparatus.ResourceMonitorInstrument#isCreation()
	 * @see #getResourceMonitorInstrument()
	 * @generated
	 */
	EAttribute getResourceMonitorInstrument_Creation();

	/**
	 * Returns the meta object for the attribute '{@link codingExperimentOntology.apparatus.ResourceMonitorInstrument#isModification <em>Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modification</em>'.
	 * @see codingExperimentOntology.apparatus.ResourceMonitorInstrument#isModification()
	 * @see #getResourceMonitorInstrument()
	 * @generated
	 */
	EAttribute getResourceMonitorInstrument_Modification();

	/**
	 * Returns the meta object for the attribute '{@link codingExperimentOntology.apparatus.ResourceMonitorInstrument#isDelete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delete</em>'.
	 * @see codingExperimentOntology.apparatus.ResourceMonitorInstrument#isDelete()
	 * @see #getResourceMonitorInstrument()
	 * @generated
	 */
	EAttribute getResourceMonitorInstrument_Delete();

	/**
	 * Returns the meta object for class '{@link codingExperimentOntology.apparatus.TimeMonitorInstrument <em>Time Monitor Instrument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Monitor Instrument</em>'.
	 * @see codingExperimentOntology.apparatus.TimeMonitorInstrument
	 * @generated
	 */
	EClass getTimeMonitorInstrument();

	/**
	 * Returns the meta object for class '{@link codingExperimentOntology.apparatus.Questionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Questionnaire</em>'.
	 * @see codingExperimentOntology.apparatus.Questionnaire
	 * @generated
	 */
	EClass getQuestionnaire();

	/**
	 * Returns the meta object for the containment reference list '{@link codingExperimentOntology.apparatus.Questionnaire#getQuestions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questions</em>'.
	 * @see codingExperimentOntology.apparatus.Questionnaire#getQuestions()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EReference getQuestionnaire_Questions();

	/**
	 * Returns the meta object for the attribute '{@link codingExperimentOntology.apparatus.Questionnaire#getAllocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allocation</em>'.
	 * @see codingExperimentOntology.apparatus.Questionnaire#getAllocation()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EAttribute getQuestionnaire_Allocation();

	/**
	 * Returns the meta object for class '{@link codingExperimentOntology.apparatus.TimeMonitorByResource <em>Time Monitor By Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Monitor By Resource</em>'.
	 * @see codingExperimentOntology.apparatus.TimeMonitorByResource
	 * @generated
	 */
	EClass getTimeMonitorByResource();

	/**
	 * Returns the meta object for the reference list '{@link codingExperimentOntology.apparatus.TimeMonitorByResource#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Artifact</em>'.
	 * @see codingExperimentOntology.apparatus.TimeMonitorByResource#getArtifact()
	 * @see #getTimeMonitorByResource()
	 * @generated
	 */
	EReference getTimeMonitorByResource_Artifact();

	/**
	 * Returns the meta object for class '{@link codingExperimentOntology.apparatus.TimeMonitorByTask <em>Time Monitor By Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Monitor By Task</em>'.
	 * @see codingExperimentOntology.apparatus.TimeMonitorByTask
	 * @generated
	 */
	EClass getTimeMonitorByTask();

	/**
	 * Returns the meta object for class '{@link codingExperimentOntology.apparatus.TimeMonitorByProcess <em>Time Monitor By Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Monitor By Process</em>'.
	 * @see codingExperimentOntology.apparatus.TimeMonitorByProcess
	 * @generated
	 */
	EClass getTimeMonitorByProcess();

	/**
	 * Returns the meta object for class '{@link codingExperimentOntology.apparatus.TaskRelated <em>Task Related</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Related</em>'.
	 * @see codingExperimentOntology.apparatus.TaskRelated
	 * @generated
	 */
	EClass getTaskRelated();

	/**
	 * Returns the meta object for the reference list '{@link codingExperimentOntology.apparatus.TaskRelated#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Task</em>'.
	 * @see codingExperimentOntology.apparatus.TaskRelated#getTask()
	 * @see #getTaskRelated()
	 * @generated
	 */
	EReference getTaskRelated_Task();

	/**
	 * Returns the meta object for class '{@link codingExperimentOntology.apparatus.ProcessRelated <em>Process Related</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Related</em>'.
	 * @see codingExperimentOntology.apparatus.ProcessRelated
	 * @generated
	 */
	EClass getProcessRelated();

	/**
	 * Returns the meta object for class '{@link codingExperimentOntology.apparatus.QuestionaryByTask <em>Questionary By Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Questionary By Task</em>'.
	 * @see codingExperimentOntology.apparatus.QuestionaryByTask
	 * @generated
	 */
	EClass getQuestionaryByTask();

	/**
	 * Returns the meta object for class '{@link codingExperimentOntology.apparatus.QuestionnaireByProcess <em>Questionnaire By Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Questionnaire By Process</em>'.
	 * @see codingExperimentOntology.apparatus.QuestionnaireByProcess
	 * @generated
	 */
	EClass getQuestionnaireByProcess();

	/**
	 * Returns the meta object for class '{@link codingExperimentOntology.apparatus.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see codingExperimentOntology.apparatus.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the containment reference '{@link codingExperimentOntology.apparatus.Question#getEnunciation <em>Enunciation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enunciation</em>'.
	 * @see codingExperimentOntology.apparatus.Question#getEnunciation()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Enunciation();

	/**
	 * Returns the meta object for class '{@link codingExperimentOntology.apparatus.QuestionContent <em>Question Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Content</em>'.
	 * @see codingExperimentOntology.apparatus.QuestionContent
	 * @generated
	 */
	EClass getQuestionContent();

	/**
	 * Returns the meta object for class '{@link codingExperimentOntology.apparatus.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see codingExperimentOntology.apparatus.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link codingExperimentOntology.apparatus.Field#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see codingExperimentOntology.apparatus.Field#getType()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Type();

	/**
	 * Returns the meta object for class '{@link codingExperimentOntology.apparatus.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see codingExperimentOntology.apparatus.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for the containment reference list '{@link codingExperimentOntology.apparatus.Choice#getChoices <em>Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Choices</em>'.
	 * @see codingExperimentOntology.apparatus.Choice#getChoices()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_Choices();

	/**
	 * Returns the meta object for the attribute '{@link codingExperimentOntology.apparatus.Choice#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see codingExperimentOntology.apparatus.Choice#getType()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_Type();

	/**
	 * Returns the meta object for enum '{@link codingExperimentOntology.apparatus.CodingArtifactTypes <em>Coding Artifact Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Coding Artifact Types</em>'.
	 * @see codingExperimentOntology.apparatus.CodingArtifactTypes
	 * @generated
	 */
	EEnum getCodingArtifactTypes();

	/**
	 * Returns the meta object for enum '{@link codingExperimentOntology.apparatus.QuestionnarieAllocation <em>Questionnarie Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Questionnarie Allocation</em>'.
	 * @see codingExperimentOntology.apparatus.QuestionnarieAllocation
	 * @generated
	 */
	EEnum getQuestionnarieAllocation();

	/**
	 * Returns the meta object for enum '{@link codingExperimentOntology.apparatus.ChoiceTypes <em>Choice Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Choice Types</em>'.
	 * @see codingExperimentOntology.apparatus.ChoiceTypes
	 * @generated
	 */
	EEnum getChoiceTypes();

	/**
	 * Returns the meta object for enum '{@link codingExperimentOntology.apparatus.FieldTypes <em>Field Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Field Types</em>'.
	 * @see codingExperimentOntology.apparatus.FieldTypes
	 * @generated
	 */
	EEnum getFieldTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NewPackage4Factory getNewPackage4Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link codingExperimentOntology.apparatus.impl.CodignApparatusImpl <em>Codign Apparatus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.apparatus.impl.CodignApparatusImpl
		 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getCodignApparatus()
		 * @generated
		 */
		EClass CODIGN_APPARATUS = eINSTANCE.getCodignApparatus();

		/**
		 * The meta object literal for the '{@link codingExperimentOntology.apparatus.impl.CodingArtifactImpl <em>Coding Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.apparatus.impl.CodingArtifactImpl
		 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getCodingArtifact()
		 * @generated
		 */
		EClass CODING_ARTIFACT = eINSTANCE.getCodingArtifact();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODING_ARTIFACT__TYPE = eINSTANCE.getCodingArtifact_Type();

		/**
		 * The meta object literal for the '{@link codingExperimentOntology.apparatus.impl.CodingInstrumentImpl <em>Coding Instrument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.apparatus.impl.CodingInstrumentImpl
		 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getCodingInstrument()
		 * @generated
		 */
		EClass CODING_INSTRUMENT = eINSTANCE.getCodingInstrument();

		/**
		 * The meta object literal for the '{@link codingExperimentOntology.apparatus.impl.ResourceMonitorInstrumentImpl <em>Resource Monitor Instrument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.apparatus.impl.ResourceMonitorInstrumentImpl
		 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getResourceMonitorInstrument()
		 * @generated
		 */
		EClass RESOURCE_MONITOR_INSTRUMENT = eINSTANCE.getResourceMonitorInstrument();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_MONITOR_INSTRUMENT__TARGET = eINSTANCE.getResourceMonitorInstrument_Target();

		/**
		 * The meta object literal for the '<em><b>Creation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_MONITOR_INSTRUMENT__CREATION = eINSTANCE.getResourceMonitorInstrument_Creation();

		/**
		 * The meta object literal for the '<em><b>Modification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_MONITOR_INSTRUMENT__MODIFICATION = eINSTANCE.getResourceMonitorInstrument_Modification();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_MONITOR_INSTRUMENT__DELETE = eINSTANCE.getResourceMonitorInstrument_Delete();

		/**
		 * The meta object literal for the '{@link codingExperimentOntology.apparatus.impl.TimeMonitorInstrumentImpl <em>Time Monitor Instrument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.apparatus.impl.TimeMonitorInstrumentImpl
		 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getTimeMonitorInstrument()
		 * @generated
		 */
		EClass TIME_MONITOR_INSTRUMENT = eINSTANCE.getTimeMonitorInstrument();

		/**
		 * The meta object literal for the '{@link codingExperimentOntology.apparatus.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.apparatus.impl.QuestionnaireImpl
		 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getQuestionnaire()
		 * @generated
		 */
		EClass QUESTIONNAIRE = eINSTANCE.getQuestionnaire();

		/**
		 * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONNAIRE__QUESTIONS = eINSTANCE.getQuestionnaire_Questions();

		/**
		 * The meta object literal for the '<em><b>Allocation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONNAIRE__ALLOCATION = eINSTANCE.getQuestionnaire_Allocation();

		/**
		 * The meta object literal for the '{@link codingExperimentOntology.apparatus.impl.TimeMonitorByResourceImpl <em>Time Monitor By Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.apparatus.impl.TimeMonitorByResourceImpl
		 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getTimeMonitorByResource()
		 * @generated
		 */
		EClass TIME_MONITOR_BY_RESOURCE = eINSTANCE.getTimeMonitorByResource();

		/**
		 * The meta object literal for the '<em><b>Artifact</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_MONITOR_BY_RESOURCE__ARTIFACT = eINSTANCE.getTimeMonitorByResource_Artifact();

		/**
		 * The meta object literal for the '{@link codingExperimentOntology.apparatus.impl.TimeMonitorByTaskImpl <em>Time Monitor By Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.apparatus.impl.TimeMonitorByTaskImpl
		 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getTimeMonitorByTask()
		 * @generated
		 */
		EClass TIME_MONITOR_BY_TASK = eINSTANCE.getTimeMonitorByTask();

		/**
		 * The meta object literal for the '{@link codingExperimentOntology.apparatus.impl.TimeMonitorByProcessImpl <em>Time Monitor By Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.apparatus.impl.TimeMonitorByProcessImpl
		 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getTimeMonitorByProcess()
		 * @generated
		 */
		EClass TIME_MONITOR_BY_PROCESS = eINSTANCE.getTimeMonitorByProcess();

		/**
		 * The meta object literal for the '{@link codingExperimentOntology.apparatus.impl.TaskRelatedImpl <em>Task Related</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.apparatus.impl.TaskRelatedImpl
		 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getTaskRelated()
		 * @generated
		 */
		EClass TASK_RELATED = eINSTANCE.getTaskRelated();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_RELATED__TASK = eINSTANCE.getTaskRelated_Task();

		/**
		 * The meta object literal for the '{@link codingExperimentOntology.apparatus.impl.ProcessRelatedImpl <em>Process Related</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.apparatus.impl.ProcessRelatedImpl
		 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getProcessRelated()
		 * @generated
		 */
		EClass PROCESS_RELATED = eINSTANCE.getProcessRelated();

		/**
		 * The meta object literal for the '{@link codingExperimentOntology.apparatus.impl.QuestionaryByTaskImpl <em>Questionary By Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.apparatus.impl.QuestionaryByTaskImpl
		 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getQuestionaryByTask()
		 * @generated
		 */
		EClass QUESTIONARY_BY_TASK = eINSTANCE.getQuestionaryByTask();

		/**
		 * The meta object literal for the '{@link codingExperimentOntology.apparatus.impl.QuestionnaireByProcessImpl <em>Questionnaire By Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.apparatus.impl.QuestionnaireByProcessImpl
		 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getQuestionnaireByProcess()
		 * @generated
		 */
		EClass QUESTIONNAIRE_BY_PROCESS = eINSTANCE.getQuestionnaireByProcess();

		/**
		 * The meta object literal for the '{@link codingExperimentOntology.apparatus.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.apparatus.impl.QuestionImpl
		 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Enunciation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__ENUNCIATION = eINSTANCE.getQuestion_Enunciation();

		/**
		 * The meta object literal for the '{@link codingExperimentOntology.apparatus.impl.QuestionContentImpl <em>Question Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.apparatus.impl.QuestionContentImpl
		 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getQuestionContent()
		 * @generated
		 */
		EClass QUESTION_CONTENT = eINSTANCE.getQuestionContent();

		/**
		 * The meta object literal for the '{@link codingExperimentOntology.apparatus.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.apparatus.impl.FieldImpl
		 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__TYPE = eINSTANCE.getField_Type();

		/**
		 * The meta object literal for the '{@link codingExperimentOntology.apparatus.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.apparatus.impl.ChoiceImpl
		 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '<em><b>Choices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICE__CHOICES = eINSTANCE.getChoice_Choices();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__TYPE = eINSTANCE.getChoice_Type();

		/**
		 * The meta object literal for the '{@link codingExperimentOntology.apparatus.CodingArtifactTypes <em>Coding Artifact Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.apparatus.CodingArtifactTypes
		 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getCodingArtifactTypes()
		 * @generated
		 */
		EEnum CODING_ARTIFACT_TYPES = eINSTANCE.getCodingArtifactTypes();

		/**
		 * The meta object literal for the '{@link codingExperimentOntology.apparatus.QuestionnarieAllocation <em>Questionnarie Allocation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.apparatus.QuestionnarieAllocation
		 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getQuestionnarieAllocation()
		 * @generated
		 */
		EEnum QUESTIONNARIE_ALLOCATION = eINSTANCE.getQuestionnarieAllocation();

		/**
		 * The meta object literal for the '{@link codingExperimentOntology.apparatus.ChoiceTypes <em>Choice Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.apparatus.ChoiceTypes
		 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getChoiceTypes()
		 * @generated
		 */
		EEnum CHOICE_TYPES = eINSTANCE.getChoiceTypes();

		/**
		 * The meta object literal for the '{@link codingExperimentOntology.apparatus.FieldTypes <em>Field Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.apparatus.FieldTypes
		 * @see codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl#getFieldTypes()
		 * @generated
		 */
		EEnum FIELD_TYPES = eINSTANCE.getFieldTypes();

	}

} //NewPackage4Package
