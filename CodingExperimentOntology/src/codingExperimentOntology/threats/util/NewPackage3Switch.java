/**
 */
package codingExperimentOntology.threats.util;

import codingExperimentOntology.threats.*;

import experimentOntology.planning.threats.Threat;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see codingExperimentOntology.threats.NewPackage3Package
 * @generated
 */
public class NewPackage3Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NewPackage3Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewPackage3Switch() {
		if (modelPackage == null) {
			modelPackage = NewPackage3Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case NewPackage3Package.INDIVIDUAL_BACKGROUND: {
				IndividualBackground individualBackground = (IndividualBackground)theEObject;
				T result = caseIndividualBackground(individualBackground);
				if (result == null) result = caseThreat(individualBackground);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.INDIVIDUAL_KNOLEGMENT: {
				IndividualKnolegment individualKnolegment = (IndividualKnolegment)theEObject;
				T result = caseIndividualKnolegment(individualKnolegment);
				if (result == null) result = caseThreat(individualKnolegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.SUBJECT_RELATED: {
				SubjectRelated subjectRelated = (SubjectRelated)theEObject;
				T result = caseSubjectRelated(subjectRelated);
				if (result == null) result = caseThreat(subjectRelated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.TECHNICAL: {
				Technical technical = (Technical)theEObject;
				T result = caseTechnical(technical);
				if (result == null) result = caseThreat(technical);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.STUDY_OBJECT_RELATED: {
				StudyObjectRelated studyObjectRelated = (StudyObjectRelated)theEObject;
				T result = caseStudyObjectRelated(studyObjectRelated);
				if (result == null) result = caseThreat(studyObjectRelated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.GENDER: {
				Gender gender = (Gender)theEObject;
				T result = caseGender(gender);
				if (result == null) result = caseIndividualBackground(gender);
				if (result == null) result = caseThreat(gender);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.INTELIGENCE: {
				Inteligence inteligence = (Inteligence)theEObject;
				T result = caseInteligence(inteligence);
				if (result == null) result = caseIndividualBackground(inteligence);
				if (result == null) result = caseThreat(inteligence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.COLOR_BLIND: {
				ColorBlind colorBlind = (ColorBlind)theEObject;
				T result = caseColorBlind(colorBlind);
				if (result == null) result = caseIndividualBackground(colorBlind);
				if (result == null) result = caseThreat(colorBlind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.CULTURE: {
				Culture culture = (Culture)theEObject;
				T result = caseCulture(culture);
				if (result == null) result = caseIndividualBackground(culture);
				if (result == null) result = caseThreat(culture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.ABILITY: {
				Ability ability = (Ability)theEObject;
				T result = caseAbility(ability);
				if (result == null) result = caseIndividualKnolegment(ability);
				if (result == null) result = caseThreat(ability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.FAMILIARITY_WITH_OBJECT: {
				FamiliarityWithObject familiarityWithObject = (FamiliarityWithObject)theEObject;
				T result = caseFamiliarityWithObject(familiarityWithObject);
				if (result == null) result = caseIndividualKnolegment(familiarityWithObject);
				if (result == null) result = caseThreat(familiarityWithObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.DOMAIN_KNOLEGMENT: {
				DomainKnolegment domainKnolegment = (DomainKnolegment)theEObject;
				T result = caseDomainKnolegment(domainKnolegment);
				if (result == null) result = caseIndividualKnolegment(domainKnolegment);
				if (result == null) result = caseThreat(domainKnolegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.PROGRAMMING_EXPERIENCE: {
				ProgrammingExperience programmingExperience = (ProgrammingExperience)theEObject;
				T result = caseProgrammingExperience(programmingExperience);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.READING_TIME: {
				ReadingTime readingTime = (ReadingTime)theEObject;
				T result = caseReadingTime(readingTime);
				if (result == null) result = caseIndividualKnolegment(readingTime);
				if (result == null) result = caseThreat(readingTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.FADIGUE: {
				Fadigue fadigue = (Fadigue)theEObject;
				T result = caseFadigue(fadigue);
				if (result == null) result = caseIndividualKnolegment(fadigue);
				if (result == null) result = caseThreat(fadigue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.MOTIVATION: {
				Motivation motivation = (Motivation)theEObject;
				T result = caseMotivation(motivation);
				if (result == null) result = caseIndividualKnolegment(motivation);
				if (result == null) result = caseThreat(motivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.TREATMENT_PREFERENCE: {
				TreatmentPreference treatmentPreference = (TreatmentPreference)theEObject;
				T result = caseTreatmentPreference(treatmentPreference);
				if (result == null) result = caseIndividualKnolegment(treatmentPreference);
				if (result == null) result = caseThreat(treatmentPreference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.EDUCATION: {
				Education education = (Education)theEObject;
				T result = caseEducation(education);
				if (result == null) result = caseIndividualKnolegment(education);
				if (result == null) result = caseThreat(education);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.FAMILIARITY_WITH_TOOL: {
				FamiliarityWithTool familiarityWithTool = (FamiliarityWithTool)theEObject;
				T result = caseFamiliarityWithTool(familiarityWithTool);
				if (result == null) result = caseIndividualKnolegment(familiarityWithTool);
				if (result == null) result = caseThreat(familiarityWithTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.AVALUATION_APPREHENSION: {
				AvaluationApprehension avaluationApprehension = (AvaluationApprehension)theEObject;
				T result = caseAvaluationApprehension(avaluationApprehension);
				if (result == null) result = caseSubjectRelated(avaluationApprehension);
				if (result == null) result = caseThreat(avaluationApprehension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.HAWTHRONE_EFFECT: {
				HawthroneEffect hawthroneEffect = (HawthroneEffect)theEObject;
				T result = caseHawthroneEffect(hawthroneEffect);
				if (result == null) result = caseSubjectRelated(hawthroneEffect);
				if (result == null) result = caseThreat(hawthroneEffect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.PROCESS_CONFORMANCE: {
				ProcessConformance processConformance = (ProcessConformance)theEObject;
				T result = caseProcessConformance(processConformance);
				if (result == null) result = caseSubjectRelated(processConformance);
				if (result == null) result = caseThreat(processConformance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.STUDY_OBJECT_COVERANGE: {
				StudyObjectCoverange studyObjectCoverange = (StudyObjectCoverange)theEObject;
				T result = caseStudyObjectCoverange(studyObjectCoverange);
				if (result == null) result = caseSubjectRelated(studyObjectCoverange);
				if (result == null) result = caseThreat(studyObjectCoverange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.TIES_TO_PERSIST_MEMORY: {
				TiesToPersistMemory tiesToPersistMemory = (TiesToPersistMemory)theEObject;
				T result = caseTiesToPersistMemory(tiesToPersistMemory);
				if (result == null) result = caseSubjectRelated(tiesToPersistMemory);
				if (result == null) result = caseThreat(tiesToPersistMemory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.TIME_PRESSURE: {
				TimePressure timePressure = (TimePressure)theEObject;
				T result = caseTimePressure(timePressure);
				if (result == null) result = caseSubjectRelated(timePressure);
				if (result == null) result = caseThreat(timePressure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.VISUAL_EFFORT: {
				VisualEffort visualEffort = (VisualEffort)theEObject;
				T result = caseVisualEffort(visualEffort);
				if (result == null) result = caseSubjectRelated(visualEffort);
				if (result == null) result = caseThreat(visualEffort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.DATA_CONSISTENCY: {
				DataConsistency dataConsistency = (DataConsistency)theEObject;
				T result = caseDataConsistency(dataConsistency);
				if (result == null) result = caseTechnical(dataConsistency);
				if (result == null) result = caseThreat(dataConsistency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.INSTRUMENTATION: {
				Instrumentation instrumentation = (Instrumentation)theEObject;
				T result = caseInstrumentation(instrumentation);
				if (result == null) result = caseTechnical(instrumentation);
				if (result == null) result = caseThreat(instrumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.MONO_OPERATION_BIAS: {
				MonoOperationBias monoOperationBias = (MonoOperationBias)theEObject;
				T result = caseMonoOperationBias(monoOperationBias);
				if (result == null) result = caseTechnical(monoOperationBias);
				if (result == null) result = caseThreat(monoOperationBias);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.MONO_METHOD_BIAS: {
				MonoMethodBias monoMethodBias = (MonoMethodBias)theEObject;
				T result = caseMonoMethodBias(monoMethodBias);
				if (result == null) result = caseTechnical(monoMethodBias);
				if (result == null) result = caseThreat(monoMethodBias);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.TECHINICAL_PROBLEM: {
				TechinicalProblem techinicalProblem = (TechinicalProblem)theEObject;
				T result = caseTechinicalProblem(techinicalProblem);
				if (result == null) result = caseTechnical(techinicalProblem);
				if (result == null) result = caseThreat(techinicalProblem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.CONTEX_RELATED: {
				ContexRelated contexRelated = (ContexRelated)theEObject;
				T result = caseContexRelated(contexRelated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.LEARNING_EFFECTS: {
				LearningEffects learningEffects = (LearningEffects)theEObject;
				T result = caseLearningEffects(learningEffects);
				if (result == null) result = caseContexRelated(learningEffects);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.MORTALITY: {
				Mortality mortality = (Mortality)theEObject;
				T result = caseMortality(mortality);
				if (result == null) result = caseContexRelated(mortality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.NEW_ECLASS36: {
				NewEClass36 newEClass36 = (NewEClass36)theEObject;
				T result = caseNewEClass36(newEClass36);
				if (result == null) result = caseContexRelated(newEClass36);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.ORDERING: {
				Ordering ordering = (Ordering)theEObject;
				T result = caseOrdering(ordering);
				if (result == null) result = caseContexRelated(ordering);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.ROSENTHAL: {
				Rosenthal rosenthal = (Rosenthal)theEObject;
				T result = caseRosenthal(rosenthal);
				if (result == null) result = caseContexRelated(rosenthal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.SELECTION: {
				Selection selection = (Selection)theEObject;
				T result = caseSelection(selection);
				if (result == null) result = caseContexRelated(selection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.CONTENT_OF_STUDY_OBJECT: {
				ContentOfStudyObject contentOfStudyObject = (ContentOfStudyObject)theEObject;
				T result = caseContentOfStudyObject(contentOfStudyObject);
				if (result == null) result = caseStudyObjectRelated(contentOfStudyObject);
				if (result == null) result = caseThreat(contentOfStudyObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.LANGUAGE: {
				Language language = (Language)theEObject;
				T result = caseLanguage(language);
				if (result == null) result = caseStudyObjectRelated(language);
				if (result == null) result = caseThreat(language);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.LAYOUT_STUDY_OBJECT: {
				LayoutStudyObject layoutStudyObject = (LayoutStudyObject)theEObject;
				T result = caseLayoutStudyObject(layoutStudyObject);
				if (result == null) result = caseStudyObjectRelated(layoutStudyObject);
				if (result == null) result = caseThreat(layoutStudyObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.SIZE_OF_STUDY_OBJECTS: {
				SizeOfStudyObjects sizeOfStudyObjects = (SizeOfStudyObjects)theEObject;
				T result = caseSizeOfStudyObjects(sizeOfStudyObjects);
				if (result == null) result = caseStudyObjectRelated(sizeOfStudyObjects);
				if (result == null) result = caseThreat(sizeOfStudyObjects);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.TASKS: {
				Tasks tasks = (Tasks)theEObject;
				T result = caseTasks(tasks);
				if (result == null) result = caseStudyObjectRelated(tasks);
				if (result == null) result = caseThreat(tasks);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.GENERIC_MITIGABLE: {
				GenericMitigable genericMitigable = (GenericMitigable)theEObject;
				T result = caseGenericMitigable(genericMitigable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.REVIEWABLE_MITIGATION: {
				ReviewableMitigation reviewableMitigation = (ReviewableMitigation)theEObject;
				T result = caseReviewableMitigation(reviewableMitigation);
				if (result == null) result = caseGenericMitigable(reviewableMitigation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.ASKABLE_MITIGATION: {
				AskableMitigation askableMitigation = (AskableMitigation)theEObject;
				T result = caseAskableMitigation(askableMitigation);
				if (result == null) result = caseGenericMitigable(askableMitigation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.GENERIC_MITIGATION: {
				GenericMitigation genericMitigation = (GenericMitigation)theEObject;
				T result = caseGenericMitigation(genericMitigation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.MITIGATING_BY_ASKING: {
				MitigatingByAsking mitigatingByAsking = (MitigatingByAsking)theEObject;
				T result = caseMitigatingByAsking(mitigatingByAsking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage3Package.MITIGATING_BY_REVIEWING: {
				MitigatingByReviewing mitigatingByReviewing = (MitigatingByReviewing)theEObject;
				T result = caseMitigatingByReviewing(mitigatingByReviewing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Individual Background</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Individual Background</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndividualBackground(IndividualBackground object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Individual Knolegment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Individual Knolegment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndividualKnolegment(IndividualKnolegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subject Related</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subject Related</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubjectRelated(SubjectRelated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technical</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technical</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnical(Technical object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Study Object Related</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Study Object Related</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudyObjectRelated(StudyObjectRelated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gender</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gender</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGender(Gender object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inteligence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inteligence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteligence(Inteligence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Blind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Blind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorBlind(ColorBlind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Culture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Culture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCulture(Culture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbility(Ability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Familiarity With Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Familiarity With Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamiliarityWithObject(FamiliarityWithObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Knolegment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Knolegment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainKnolegment(DomainKnolegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Programming Experience</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Programming Experience</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgrammingExperience(ProgrammingExperience object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reading Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reading Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadingTime(ReadingTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fadigue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fadigue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFadigue(Fadigue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Motivation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Motivation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMotivation(Motivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Treatment Preference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Treatment Preference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTreatmentPreference(TreatmentPreference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Education</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Education</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEducation(Education object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Familiarity With Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Familiarity With Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamiliarityWithTool(FamiliarityWithTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avaluation Apprehension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avaluation Apprehension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvaluationApprehension(AvaluationApprehension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hawthrone Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hawthrone Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHawthroneEffect(HawthroneEffect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Conformance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Conformance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessConformance(ProcessConformance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Study Object Coverange</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Study Object Coverange</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudyObjectCoverange(StudyObjectCoverange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ties To Persist Memory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ties To Persist Memory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTiesToPersistMemory(TiesToPersistMemory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Pressure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Pressure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimePressure(TimePressure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visual Effort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visual Effort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisualEffort(VisualEffort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Consistency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Consistency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataConsistency(DataConsistency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instrumentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instrumentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstrumentation(Instrumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mono Operation Bias</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mono Operation Bias</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonoOperationBias(MonoOperationBias object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mono Method Bias</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mono Method Bias</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonoMethodBias(MonoMethodBias object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Techinical Problem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Techinical Problem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechinicalProblem(TechinicalProblem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contex Related</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contex Related</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContexRelated(ContexRelated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Learning Effects</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Learning Effects</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLearningEffects(LearningEffects object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mortality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mortality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMortality(Mortality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New EClass36</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New EClass36</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewEClass36(NewEClass36 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordering</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordering</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrdering(Ordering object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rosenthal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rosenthal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRosenthal(Rosenthal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelection(Selection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Of Study Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Of Study Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentOfStudyObject(ContentOfStudyObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguage(Language object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layout Study Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layout Study Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayoutStudyObject(LayoutStudyObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Size Of Study Objects</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Size Of Study Objects</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSizeOfStudyObjects(SizeOfStudyObjects object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tasks</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tasks</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTasks(Tasks object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Mitigable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Mitigable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericMitigable(GenericMitigable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reviewable Mitigation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reviewable Mitigation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReviewableMitigation(ReviewableMitigation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Askable Mitigation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Askable Mitigation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAskableMitigation(AskableMitigation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Mitigation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Mitigation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericMitigation(GenericMitigation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mitigating By Asking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mitigating By Asking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMitigatingByAsking(MitigatingByAsking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mitigating By Reviewing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mitigating By Reviewing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMitigatingByReviewing(MitigatingByReviewing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Threat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Threat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThreat(Threat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //NewPackage3Switch
